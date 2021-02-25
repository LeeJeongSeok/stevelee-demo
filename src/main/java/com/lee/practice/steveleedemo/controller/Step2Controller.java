package com.lee.practice.steveleedemo.controller;

import com.lee.practice.steveleedemo.domain.Human;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class Step2Controller {


    @GetMapping("/step2")
    public String step2(Model model) {

        Human stevelee = new Human("stevelee", "male");
        Human sunho = new Human("sunho", "male");
        Human myeongju = new Human("myeongju", "male");

        ArrayList<Human> list = new ArrayList<>();

        list.add(stevelee);
        list.add(sunho);
        list.add(myeongju);

        model.addAttribute("test", list);

        return "step2";
    }

}
