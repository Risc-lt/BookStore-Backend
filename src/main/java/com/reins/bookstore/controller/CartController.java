package com.reins.bookstore.controller;

import com.reins.bookstore.entity.CartItem;
import com.reins.bookstore.service.CartService;
import com.reins.bookstore.utils.SessionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class CartController {
    @Autowired
    CartService cartService;

    @GetMapping
    public ResponseEntity<List<CartItem>> getUserItems() {
        Long userId = SessionUtils.getUserId();
        return ResponseEntity.ok(cartService.getUserCartItems(userId));
    }
}
