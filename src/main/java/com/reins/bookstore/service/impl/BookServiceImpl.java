package com.reins.bookstore.service.impl;

import com.reins.bookstore.dao.BookDAO;
import com.reins.bookstore.entity.Book;
import com.reins.bookstore.models.PagedItems;
import com.reins.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookDAO bookDAO;

    @Override
    public PagedItems<Book> searchBooks(String keyword, Integer pageIndex, Integer pageSize) {
        Page<Book> pagedBooks = bookDAO.searchBooksByKeyword(keyword, pageIndex, pageSize);
        return new PagedItems<>(pagedBooks.getTotalPages(), pagedBooks.toList());
    }

    @Override
    public Book getBookById(Long id) {
        return bookDAO.getById(id);
    }

    @Override
    public List<Book> getTop10BestsellingBooks() {
        return bookDAO.getTop10BestsellingBooks();
    }
}
