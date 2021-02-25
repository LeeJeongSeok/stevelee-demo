package com.lee.practice.steveleedemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Step3Controller {

    @GetMapping("/step3")
    public String step3() {
        return "step3";
    }

}
