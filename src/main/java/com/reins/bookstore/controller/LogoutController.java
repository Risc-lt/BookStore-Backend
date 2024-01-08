package com.reins.bookstore.controller;


import com.reins.bookstore.constants.Messages;
import com.reins.bookstore.models.ApiResponseBase;
import com.reins.bookstore.utils.SessionUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/logout")
public class LogoutController {
    @PutMapping
    public ResponseEntity<ApiResponseBase> logout() {
        SessionUtils.removeSession();
        return ResponseEntity.ok(ApiResponseBase.succeed(Messages.LOGOUT_SUCCEED));
    }
}
