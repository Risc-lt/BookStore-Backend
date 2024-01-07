package com.reins.bookstore.service;

import com.reins.bookstore.entity.Book;
import com.reins.bookstore.models.PagedItems;


public interface BookService {
    PagedItems<Book> searchBooks(String keyword, Integer pageIndex, Integer pageSize);

    Book getBookById(Long id);
}
