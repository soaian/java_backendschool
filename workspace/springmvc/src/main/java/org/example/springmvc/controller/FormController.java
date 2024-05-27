package org.example.springmvc.controller;

import jakarta.validation.Valid;
import org.example.springmvc.domain.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
    @GetMapping("/form")
    public String showForm(Model model){
        model.addAttribute("userForm", new UserForm());
        return "form";
    }

//    @PostMapping("/submitForm")
//    public String submitForm(@RequestParam String username, @RequestParam String password){
//        System.out.println(username + " : " + password);
//        return "result";
//    }

//    @PostMapping("/submitForm")
//    public String submitForm(@ModelAttribute UserForm userForm){ //조건때문에 그런건 아니고 그냥 이렇게 받을 수 있음 헨들러 어뎁터가 이렇게 해주는 것 중요한것은 이때 html상 input 문장의 name과 변수명이 같아야함
//        System.out.println(userForm.getUsername() + " : " + userForm.getPassword());
//        return "result";
//    }
    //@valid를 붙여야 체크를 해줌
    @PostMapping("/submitForm")
    public String submitForm(@Valid @ModelAttribute("userForm")UserForm userForm, BindingResult result){
        if (result.hasErrors()){
            return "form"; // 유효성 검사에서 에러가 발견되었다면 form.html로 리턴해줌
        }
        return "result"; // 에러가 발견되지 않았다면 result.html로 리턴해줌
    }
}
