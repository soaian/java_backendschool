package org.example.springmvc.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller // 응답을 view로 할거야
//@RestController // 응답을 데이타로 할거야
public class MyController {
    @GetMapping("/home") // 굳이 같을 필욘 없음
    public String name(){ //
        return "home"; // view name
    }

//    @GetMapping("/about")
//    public String about(){
//        return "about";
//    }

    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }

    @ResponseBody //view가 아니라 데이타로 판단
    @GetMapping("/rest")
    public String rest(){
        return "restbody test!!";
    }
// 리퀘스트를 통해 맡기고 쓰는 역할을 하고있음 이를 모델로 처리할 수 있음
//    @GetMapping("/greeting")
//    public String greet(String name, int age, HttpServletRequest request){
////        http://localhost:8888/greeting?name=carami
//        //?name=carami&age=20 쿼리문자열
//        System.out.println(name);
//        System.out.println(age);
//
//        System.out.println("request::: " + request.getParameter("name"));
//        System.out.println("request::: " + request.getParameter("age"));
//        return "greeting";
//    }

    // 뷰는 스트링으로 리턴받고 그 후 model을 사용해서 값을 넘기는 방식
//    @GetMapping("/greeting")
//    public String greet(
//            @RequestParam String name,
//            @RequestParam(name = "age", required = false, defaultValue = "10") int age,Model model){ //request로 받은 값은 String이지만 int로 자동변환 해주고 있는 것
////        http://localhost:8888/greeting?name=carami
//        //?name=carami&age=20 쿼리문자열
//        System.out.println(name);
//        System.out.println(age);
//
//        model.addAttribute("name",name);
//
//        //이때 얻은 값을... 서비스
//        return "greeting";
//    }

    // 뷰와 값을 넘기는 방식을 모두 한꺼번에 modelandview를 이용해서 처리함
    @GetMapping("/greeting")
    public String greet(
            @RequestParam String name, ModelAndView modelAndView){
//        http://localhost:8888/greeting?name=carami
        //?name=carami&age=20 쿼리문자열
        System.out.println(name);

        modelAndView.addObject("name",name);
        modelAndView.setViewName("greeting");
        //값을 넘겨줌
        return "greeting";
    }
}
