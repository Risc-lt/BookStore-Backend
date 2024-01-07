package com.reins.bookstore.service.impl;

import com.reins.bookstore.dao.CartDAO;
import com.reins.bookstore.entity.CartItem;
import com.reins.bookstore.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    CartDAO cartDAO;

    @Override
    public List<CartItem> getUserCartItems(Long userId) {
        return cartDAO.getUserItems(userId);
    }
}
