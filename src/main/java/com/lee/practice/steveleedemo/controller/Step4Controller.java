package com.lee.practice.steveleedemo.controller;

import com.lee.practice.steveleedemo.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

@Controller
public class Step4Controller {

    @PostMapping("/step4")
    public String step4(@RequestBody User user) {

        System.out.println(user);

        // 넘어온 데이터를 바로 객체에 집어넣는다.
        ArrayList<User> list = new ArrayList<>();

        System.out.println(list.size());

        return "step4";
    }
}
