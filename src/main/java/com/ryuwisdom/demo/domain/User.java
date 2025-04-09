package com.ryuwisdom.demo.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity // JPA에서 이 클래스를 테이블로 본다는 의미
@Table(name ="users")
@Getter @Setter //  각 필드의 getter/setter 자동 생성
@NoArgsConstructor // 파라미터 없는 기본 생성자 생성
@AllArgsConstructor // 모든 필드를 인자로 받는 생성자 생성
@Builder // 빌더 패턴 적용
public class User {

    @Id // DB의 기본키(Primary Key)를 나타내는 어노테이션
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id 값을 자동으로 생성해달라는 의미
    //  GenerationType.IDENTITY : DB에 있는 자동 증가(auto increment)기능 활용
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;
}