package org.example.springmvc.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("visitCount2") //세선에 저장해줌
public class SessionController {

    @ModelAttribute("visitCount2") // 초기화해주는 코드 (초기방문횟수 =0)
    public Integer initVisitCount2(){
        return 0;
    }

    @GetMapping("/visit2")
    public String trackVisit(@ModelAttribute("visitCount2") Integer visitCount2, Model model) { //꺼내서 담는것까지 해줌
        visitCount2++;
        model.addAttribute("visitCount2",visitCount2);

        return "visit2";
    }
    //    @GetMapping("/visit2")
//    public String trackVisit(HttpSession session){
//        //세션으로부터 방문 횟수를 얻어온다.
//        Integer visitCount = (Integer)session.getAttribute("visitCount");
//        if (visitCount == null){
//            visitCount = 0;
//        }
//        visitCount++;
//        session.setAttribute("visitCount",visitCount);
//        return "visit2";
//    }

//    @GetMapping("resetVisit") // 삭제하는 코드
//    public String resetVisit(SessionStatus status){
//        status.setComplete();
//        return "redirect:/visit2"; //세션을 초기화하고 여기로 가줘요
//    }

    @GetMapping("resetVisit") // 삭제하는 코드
    public String resetVisit(HttpSession session){
        // 세션객체에서 해당 속성만 삭제.
        session.removeAttribute("visitCount2");
        return "redirect:/visit2"; //세션을 초기화하고 여기로 가줘요
    }

}
