//  요청/응답용 데이터 객체
package com.ryuwisdom.demo.dto;
import lombok.*;

//@Getter
//@Setter
//public class UserDTO {
//    private String username;
//    private String email;
//
//    public UserDTO(String username, String email) {
//        this.username = username;
//        this.email = email;
//    }
//
//    public void setUsername(String username) {this.username = username;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//}

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private String username;
    private String email;
}