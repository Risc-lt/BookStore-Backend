package com.reins.bookstore.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String title;
    String author;
    @Column(columnDefinition = "TEXT")
    String description;
    Integer price;
    String cover;
}
