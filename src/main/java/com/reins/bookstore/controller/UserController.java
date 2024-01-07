package com.reins.bookstore.controller;

import com.reins.bookstore.entity.User;
import com.reins.bookstore.service.UserService;
import com.reins.bookstore.utils.SessionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/me")
    ResponseEntity<User> getMe() {
        Long userId = SessionUtils.getUserId();
        return ResponseEntity.ok(userService.getUser(userId));
    }
}
