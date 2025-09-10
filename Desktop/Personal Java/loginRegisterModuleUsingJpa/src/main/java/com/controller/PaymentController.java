package com.controller;

import com.entity.ShopHatOrder;
import com.razorpay.Order;
import com.service.PaymentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
@CrossOrigin(origins = "http://localhost:4200")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/create-order")
    public ResponseEntity<?> createOrder(@RequestBody ShopHatOrder booking) {
        try {
            Order order = paymentService.createOrder(booking);
            return ResponseEntity.ok(order.toJson()); // send Razorpay order JSON
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error: " + e.getMessage());
        }
    }

    @PostMapping("/update-status/{orderId}/{status}")
    public ResponseEntity<?> updateStatus(@PathVariable String orderId, @PathVariable String status) {
        paymentService.updateStatus(orderId, status);
        return ResponseEntity.ok("Status updated to " + status);
    }
}
