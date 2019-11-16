package com.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @RequestMapping("/hello")
    public ModelAndView showHello(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hellow");
        return modelAndView;
    }
}
