package org.example.springmvc.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RoutingController {
    @GetMapping("/start")
    public String startProcess(Model model){
        model.addAttribute("forwardTest","carami!!");
        System.out.println("startProcess");
        return "forward:/forward";
    }
    @GetMapping("/forward")
    public String forward(Model model, HttpServletRequest request){
        System.out.println("forwardTest:::::"+model.getAttribute("forwardTest")); // model이 request 를 이용해서 값을 저장하기 때문에 model에 저장된 값은 없지만 request에 저장이 되어있음
        System.out.println(request.getAttribute("forwardTest"));
        System.out.println("forwardProcess");
        return "forwardPage"; // 뷰 이름
    }
    //request가  바꼈기 때문에 model에 저장된 값이 유지되지 않음
    @GetMapping("/redirect")
    public String redirect(Model model){
        model.addAttribute("redirectTest","carami");
        System.out.println("redirectProcess");
        return "redirect:/finalDestination";
    }

    @GetMapping("/finalDestination")
    public String finalDestination(Model model,HttpServletRequest request){
        System.out.println("redirectTest:::::"+model.getAttribute("redirectTest"));
        System.out.println(request.getAttribute("redirectTest"));
        System.out.println("finalDestinationProcess");
        return "redirectPage";
    }
    
}
