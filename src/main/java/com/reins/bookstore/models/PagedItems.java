package com.reins.bookstore.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class PagedItems<T> {
    Integer total;
    List<T> items;
}
