package org.example.springmvc.controller;

import org.example.springmvc.domain.Item;
import org.example.springmvc.domain.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class ExamController {
    @GetMapping("/guest/{name}")
    public String guest(@PathVariable("name") String name){
        System.out.println(name);
        return "redirect:/welcome";
    }
    @GetMapping("/welcome")
    public String welcome(Model model){
        model.addAttribute("welcomeMsg","환영합니다^^ spring MVC를 이용해 보겠습니다.");
        List<Item> items = Arrays.asList(
          new Item("pen",3000),
          new Item("notebook",50000),
          new Item("cup",2500)
        );

        model.addAttribute("itemList",items);

        return "welcome"; // 리턴은 뷰의 이름. 즉 welcome.html파일을 만들어야함
    }
    private List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(1, "Apple", 1.20),
            new Product(2, "Banana", 0.75),
            new Product(3, "Cherry", 2.05)
    ));
    @GetMapping("/products")
    public String product(Model model) {
        model.addAttribute("productMsg","상품리스트");

        model.addAttribute("products",products);
        return "products";
    }

    @GetMapping("/example")
    public String showExam(Model model){
        model.addAttribute("username", "carami");
        model.addAttribute("isAdmin",true);
        model.addAttribute("languages", new String[]{"English", "Spanish","German"});

        return "exam";
    }
}
