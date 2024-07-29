package com.reins.bookstore.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String nickname;

    String avatar;

    String introduction;

    Long balance;

    @OneToOne(fetch = FetchType.EAGER, mappedBy = "user")
    UserAuth userAuth;

    public User(Long id) {
        this.id = id;
    }
}
