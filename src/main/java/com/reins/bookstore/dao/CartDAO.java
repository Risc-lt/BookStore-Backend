package com.reins.bookstore.dao;

import com.reins.bookstore.entity.CartItem;

import java.util.List;

public interface CartDAO {
    List<CartItem> getUserItems(Long userId);

    void deleteById(Long id);

    void addOne(Long userId, Long bookId);

    boolean exists(Long userId, Long bookId);
}
