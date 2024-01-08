package com.reins.bookstore.controller;

import com.reins.bookstore.entity.Order;
import com.reins.bookstore.models.ApiResponseBase;
import com.reins.bookstore.models.OrderInfo;
import com.reins.bookstore.service.OrderService;
import com.reins.bookstore.utils.SessionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping
    ResponseEntity<ApiResponseBase> placeOrder(@RequestBody OrderInfo orderInfo) {
        return ResponseEntity.ok(orderService.placeOrder(SessionUtils.getUserId(), orderInfo));
    }

    @GetMapping
    ResponseEntity<List<Order>> getOrders() {
        return ResponseEntity.ok(orderService.getOrders(SessionUtils.getUserId()));
    }
}
