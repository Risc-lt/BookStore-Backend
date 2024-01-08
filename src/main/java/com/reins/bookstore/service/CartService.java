package com.reins.bookstore.service;

import com.reins.bookstore.entity.CartItem;
import com.reins.bookstore.models.ApiResponseBase;

import java.util.List;

public interface CartService {
    List<CartItem> getUserCartItems(Long userId);

    ApiResponseBase deleteItem(Long id);

    ApiResponseBase addItem(Long userId, Long bookId);
}
