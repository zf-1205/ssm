package com.yjxxt.controller;

import com.yjxxt.po.User;
import com.yjxxt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {
    @Autowired
    private UserService userService;
    @RequestMapping("/hello")
    @ResponseBody
    public User hello(Model modelAndView){
        //调用UserService 层查询方法
        User user=userService.queryUserByUserId(1);
//        modelAndView.addAttribute("user",user);
//        System.out.println(user);
        System.out.println(user);
        System.out.println();
        return user;
    }
}
