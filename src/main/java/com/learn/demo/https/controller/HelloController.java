package com.learn.demo.https.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
@Slf4j
public class HelloController {

    @GetMapping("/v1/test1")
    public String test1(){
        log.info("test1");
        return "true";
    }

    @PostMapping("/v1/test2")
    public String test2(){
        log.info("test1");
        return "true";
    }

}
