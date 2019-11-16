package com.cn.controller;

import com.cn.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HellowController {

    @RequestMapping("/print")
    public ModelAndView print(){
        User user = new User();
        user.setAge(12);
        user.setName("zhangsan");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hellowUesr");
        modelAndView.addObject("user", user);
        return modelAndView;
    }
}
