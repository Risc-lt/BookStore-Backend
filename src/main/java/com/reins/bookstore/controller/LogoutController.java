package com.reins.bookstore.controller;


import com.reins.bookstore.utils.SessionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/logout")
public class LogoutController {
    @GetMapping
    public void logout() {
        SessionUtils.removeSession();
    }
}
