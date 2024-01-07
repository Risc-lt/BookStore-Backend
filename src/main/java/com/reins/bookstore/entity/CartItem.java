package com.reins.bookstore.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinColumn(name = "userId", referencedColumnName = "id")
    User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "bookId", referencedColumnName = "id")
    Book book;

    Integer number;
}
