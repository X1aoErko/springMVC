package com.lee.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("/hello")
public class RequestMappingController {
    @RequestMapping(
            value = {"/test","/testRequestMapping"},
            method = {RequestMethod.POST}
    )
    public String success(){
        return "success";
    }

    @RequestMapping("/testpath/{id}/{username}")
    public String testRest(@PathVariable("id") Integer id,@PathVariable("username") String username){
        System.out.println("id:" + id + ",username:" + username);
        return "success";
    }
}
