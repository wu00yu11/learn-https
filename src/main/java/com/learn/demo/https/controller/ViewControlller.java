package com.learn.demo.https.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/view")
public class ViewControlller {

    @GetMapping("index")
    public String index(){
        return "index";
    }
}