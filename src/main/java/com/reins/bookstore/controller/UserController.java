package com.reins.bookstore.controller;

import com.reins.bookstore.entity.User;
import com.reins.bookstore.service.UserService;
import com.reins.bookstore.utils.SessionUtils;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@Tag(name = "User", description = "用户相关 API")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/me")
    @Operation(summary = "获取\"我\"的信息")
    ResponseEntity<User> getMe() {
        Long userId = SessionUtils.getUserId();
        return ResponseEntity.ok(userService.getUser(userId));
    }
}
