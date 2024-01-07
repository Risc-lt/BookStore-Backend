package com.reins.bookstore.dao.impl;

import com.reins.bookstore.dao.CartDAO;
import com.reins.bookstore.entity.CartItem;
import com.reins.bookstore.entity.User;
import com.reins.bookstore.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CartDAOImpl implements CartDAO {
    @Autowired
    CartRepository cartRepository;

    @Override
    public List<CartItem> getUserItems(Long userId) {
        return cartRepository.findAllByUserOrderByIdDesc(new User(userId));
    }
}
