package com.reins.bookstore.dao;

import com.reins.bookstore.entity.Book;
import org.springframework.data.domain.Page;

public interface BookDAO {
    Page<Book> searchBooksByKeyword(String keyword, Integer pageIndex, Integer pageSize);

    Book getById(Long id);
}
