package com.reins.bookstore.controller;

import com.reins.bookstore.entity.Book;
import com.reins.bookstore.models.PagedItems;
import com.reins.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/api/books")
    ResponseEntity<PagedItems<Book>> searchBooks(@RequestParam String keyword, Integer pageIndex, Integer pageSize) {
        if (pageIndex == null || pageIndex < 0 || pageSize == null || pageSize < 0) {
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(bookService.searchBooks(keyword, pageIndex, pageSize));
    }

    @GetMapping("/api/book/{id}")
    ResponseEntity<Book> getBookById(@PathVariable Long id) {
        Book book = bookService.getBookById(id);
        if (book == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(book);
    }
}
