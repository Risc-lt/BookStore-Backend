package com.reins.bookstore.dao.impl;

import com.reins.bookstore.dao.UserDAO;
import com.reins.bookstore.entity.User;
import com.reins.bookstore.entity.UserAuth;
import com.reins.bookstore.repository.UserAuthRepository;
import com.reins.bookstore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDAOImpl implements UserDAO {
    @Autowired
    UserAuthRepository userAuthRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public UserAuth getAuth(String username) {
        return userAuthRepository.findByUsername(username);
    }

    @Override
    public User getById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
