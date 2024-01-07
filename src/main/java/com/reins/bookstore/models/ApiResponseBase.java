package com.reins.bookstore.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiResponseBase {
    String message;
    Boolean ok;
    Object data;

    public static ApiResponseBase succeed(String message, Object data) {
        return new ApiResponseBase(message, true, data);
    }

    public static ApiResponseBase fail(String message, Object data) {
        return new ApiResponseBase(message, false, data);
    }
}
