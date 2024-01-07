package com.reins.bookstore.dao.impl;

import com.reins.bookstore.dao.BookDAO;
import com.reins.bookstore.entity.Book;
import com.reins.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@Component
public class BookDAOImpl implements BookDAO {
    @Autowired
    BookRepository bookRepository;

    @Override
    public Page<Book> searchBooksByKeyword(String keyword, Integer pageIndex, Integer pageSize) {
        Pageable pageable = PageRequest.of(pageIndex, pageSize);
        String wrapped = "%" + keyword + "%";
        return bookRepository.findAllByAuthorLikeOrTitleLike(wrapped, wrapped, pageable);
    }

    @Override
    public Book getById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }
}
