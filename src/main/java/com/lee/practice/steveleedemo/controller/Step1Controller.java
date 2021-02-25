package com.lee.practice.steveleedemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;

@Controller
public class Step1Controller {

    @GetMapping("/step1")
    public String hello() {
        return "step1";
    }

}
