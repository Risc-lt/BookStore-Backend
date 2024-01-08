package com.reins.bookstore.service.impl;

import com.reins.bookstore.constants.Messages;
import com.reins.bookstore.dao.BookDAO;
import com.reins.bookstore.dao.CartDAO;
import com.reins.bookstore.dao.OrderDAO;
import com.reins.bookstore.dao.UserDAO;
import com.reins.bookstore.entity.Book;
import com.reins.bookstore.entity.CartItem;
import com.reins.bookstore.entity.Order;
import com.reins.bookstore.models.ApiResponseBase;
import com.reins.bookstore.models.OrderInfo;
import com.reins.bookstore.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderDAO orderDAO;

    @Autowired
    UserDAO userDAO;

    @Autowired
    BookDAO bookDAO;

    @Autowired
    CartDAO cartDAO;

    private Long computeTotalPrice(OrderInfo orderInfo) {
        long totalPrice = 0L;
        List<CartItem> cartItems = new ArrayList<>();
        for (Long cartItemId : orderInfo.getItemIds()) {
            CartItem cartItem = cartDAO.getById(cartItemId);
            if (cartItem == null) {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
            }
            Book book = cartItem.getBook();
            if (book == null) {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
            }
            totalPrice += (long) cartItem.getNumber() * book.getPrice();
            cartItems.add(cartItem);
        }
        orderInfo.setItems(cartItems);
        return totalPrice;
    }

    @Override
    @Transactional
    public ApiResponseBase placeOrder(Long userId, OrderInfo orderInfo) {
        long totalPrice = computeTotalPrice(orderInfo);
        long userBalance = userDAO.getUserBalance(userId);

        if (totalPrice > userBalance) {
            return ApiResponseBase.fail(Messages.BALANCE_NOT_ENOUGH);
        }

        long rest = userBalance - totalPrice;
        userDAO.updateUserBalance(userId, rest);
        orderDAO.saveOrder(userId, orderInfo);

        // update book sales
        bookDAO.updateSales(orderInfo.getItems());

        // remove cart items
        cartDAO.removeAll(orderInfo.getItems());
        return ApiResponseBase.succeed(Messages.PLACE_ORDER_SUCCEED);
    }

    @Override
    public List<Order> getOrders(Long userId) {
        return orderDAO.getByUserId(userId);
    }
}
