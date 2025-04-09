package com.ryuwisdom.demo.dto;
import lombok.*;

@Getter @Setter
@NoArgsConstructor // 빈 생성자 필수
@AllArgsConstructor //
public class UserDTO_1 {
    private String username;
    private String email;
}