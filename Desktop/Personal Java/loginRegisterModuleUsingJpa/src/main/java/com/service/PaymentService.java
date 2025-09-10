package com.service;

import com.entity.ShopHatOrder;
import com.repo.Orders;
import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PaymentService {

    private final Orders orderRepo;

    @Value("${razorpay.key_id}")
    private String keyId;

    @Value("${razorpay.key_secret}")
    private String keySecret;

    public PaymentService(Orders orderRepo) {
        this.orderRepo = orderRepo;
    }

    public Order createOrder(ShopHatOrder booking) throws Exception {
        RazorpayClient client = new RazorpayClient(keyId, keySecret);

        // ✅ booking.getAmount() is in RUPEES → multiply by 100 for paise
        int amountInPaise = booking.getAmount() * 100;

        System.out.println("Booking Amount (₹): " + booking.getAmount());
        System.out.println("Amount sent to Razorpay (paise): " + amountInPaise);

        JSONObject options = new JSONObject();
        options.put("amount", amountInPaise); 
        options.put("currency", "INR");
        options.put("receipt", "order_rcpt_" + System.currentTimeMillis());
        options.put("payment_capture", 1);

        Order razorOrder = client.orders.create(options);

        // Save order in DB (store rupees only)
        booking.setOrderId(razorOrder.get("id"));
        booking.setReceipt(razorOrder.get("receipt"));
        booking.setCurrency("INR");
        booking.setStatus("CREATED");
        booking.setCreatedAt(LocalDateTime.now());
        orderRepo.save(booking);

        return razorOrder;
    }

    public void updateStatus(String orderId, String status) {
        ShopHatOrder order = orderRepo.findByOrderId(orderId);
        if (order != null) {
            order.setStatus(status);
            orderRepo.save(order);
        }
    }
}
