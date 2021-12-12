package com.lee.mvc.controller;

import com.lee.mvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Controller
public class ParamController {
    @RequestMapping("/testServletAPI")
    public String testServletAPI(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username:" + username + ",password:" + password);
        return "success";
    }
    @RequestMapping("/testParam")
    public String testParam(
            @RequestParam(value = "user_name",defaultValue = "admin") String username,
            @RequestParam(value = "pass_word",defaultValue = "1234556") String password, String hobby){
        System.out.println("username:" + username + ",password:" + password + "\n hobbies:" + hobby);
        //Arrays.toString(hobbies);
        return "success";
    }
    @RequestMapping("/testBean")
    public String testBean(User user){
        System.out.println(user);
        return "success";
    }
}
