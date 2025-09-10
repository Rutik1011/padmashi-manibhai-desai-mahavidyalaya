package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.ShopHatOrder;

public interface Orders extends JpaRepository<ShopHatOrder, Long> {
         ShopHatOrder findByOrderId(String orderId);
}
