package com.reins.bookstore.service;

import com.reins.bookstore.entity.CartItem;

import java.util.List;

public interface CartService {
    List<CartItem> getUserCartItems(Long userId);
}
