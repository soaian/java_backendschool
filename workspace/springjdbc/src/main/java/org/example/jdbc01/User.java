package org.example.jdbc01;

import lombok.*;

//rombok을 활용해서 getter와 생성자를 컴파일시에 자동으로 생성
@AllArgsConstructor //기본 생성자
@Getter
@ToString
@NoArgsConstructor //default 생성자
@Setter
public class User {
    private Long id;
    private String name;
    private String email;

//    public User(Long id, String name, String email) {
//        this.id = id;
//        this.name = name;
//        this.email = email;
//    }


}
