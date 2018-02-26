package com.seecen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("helloController")
public class HelloController {

    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }
}
