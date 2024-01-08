package com.reins.bookstore.dao.impl;

import com.reins.bookstore.dao.OrderDAO;
import com.reins.bookstore.entity.*;
import com.reins.bookstore.models.OrderInfo;
import com.reins.bookstore.repository.CartRepository;
import com.reins.bookstore.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderDAOImpl implements OrderDAO {
    @Autowired
    OrderRepository orderRepository;

    @Autowired
    CartRepository cartRepository;

    @Override
    @Transactional
    public void saveOrder(Long userId, OrderInfo orderInfo) {
        Order order = new Order(
                null,
                orderInfo.getReceiver(),
                orderInfo.getAddress(),
                orderInfo.getTel(),
                new ArrayList<>(),
                new User(userId)
        );
        for (CartItem cartItem : orderInfo.getItems()) {
            OrderItem item = new OrderItem(null, cartItem.getBook(), cartItem.getNumber(), order);
            order.getItems().add(item);
        }
        orderRepository.save(order);
    }

    @Override
    public List<Order> getByUserId(Long userId) {
        return orderRepository.findAllByUser(new User(userId));
    }
}
