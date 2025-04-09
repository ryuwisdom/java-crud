package com.ryuwisdom.demo.domain;

import jakarta.persistence.*;
import lombok.*;
// jpa anno
@Entity
@Table(name ="users1")
// lombok anno
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User_1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false, unique = true)
    private String email;
}