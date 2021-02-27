package com.lee.practice.steveleedemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;

@Controller
public class Step3Controller {

    int count = 0;
    ArrayList<String> list = new ArrayList<>();

    @GetMapping("/step3")
    public String step3(HttpServletRequest request, Model model) {

        HttpSession session;

        // 세션키 생성
        session = request.getSession();

        if (session.isNew()) {
            count++;
            System.out.println("num : " + count + "/" + "id : " + session.getId() + "Date : " + new Date(session.getCreationTime()));
            list.add("num : " + count + "/" + "id : " + session.getId() + "Date : " + new Date(session.getCreationTime()));
//            session.setAttribute("result", list);
            model.addAttribute("test", list);
        } else {
            System.out.println("이미 있는 세션입니다.");
        }
        return "step3";
    }

}
