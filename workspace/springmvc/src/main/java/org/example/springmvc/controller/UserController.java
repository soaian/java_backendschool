package org.example.springmvc.controller;

import org.example.springmvc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// /users 사용자 목록을 출력하세요
// 사용자 목록에서ㅓ 사용자, 관리자 여부
// -- 이 값을 메시지프로퍼티를 이용해서 출력하도록 작성
// 메소드명은 상관없음 맘대로하면됨
@Controller
public class UserController {
    private List<User> users = new ArrayList<>(Arrays.asList(
            new User("John Doe",true),
            new User("Jane Doe", false),
            new User("Jim Beam",true)
    ));
    @GetMapping("/users")
    public String users(Model model){
        model.addAttribute("users",users);
        return "users";
    }
}
