package com.reins.bookstore.service.impl;

import com.reins.bookstore.constants.Messages;
import com.reins.bookstore.dao.CartDAO;
import com.reins.bookstore.entity.CartItem;
import com.reins.bookstore.models.ApiResponseBase;
import com.reins.bookstore.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    CartDAO cartDAO;

    @Override
    public List<CartItem> getUserCartItems(Long userId) {
        return cartDAO.getUserItems(userId);
    }

    @Override
    @Transactional
    public ApiResponseBase deleteItem(Long id) {
        cartDAO.deleteById(id);
        return ApiResponseBase.succeed(Messages.DELETE_SUCCEED);
    }

    @Override
    @Transactional
    public ApiResponseBase addItem(Long userId, Long bookId) {
        if (cartDAO.exists(userId, bookId)) {
            return ApiResponseBase.fail(Messages.CART_ITEM_EXISTS);
        }

        cartDAO.addOne(userId, bookId);
        return ApiResponseBase.succeed(Messages.ADD_CART_SUCCEED);
    }
}
