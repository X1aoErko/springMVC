package com.lee.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/target")
    public String target(){
        return "target";
    }
    @RequestMapping("/param")
    public String param(){return "test_param";}
}
