package com.lee.practice.steveleedemo.controller;

import com.lee.practice.steveleedemo.domain.User;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
public class Step4Controller {

    @GetMapping("/step4")
    public String show() {
        return "step4";
    }


    @PostMapping("/step4")
    public @ResponseBody String step4(@RequestBody List<User> users) {

        System.out.println(users.size());

        JSONParser parser = new JSONParser();
        JSONObject object = new JSONObject();

        for (User user : users) {
            System.out.println(user.getMail_id());
        }


        return "ok";
    }
}
