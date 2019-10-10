package com.cn.controller;

import com.cn.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jws.soap.SOAPBinding;

@Controller
public class UserController {
    @RequestMapping("/testPage")
    public @ResponseBody User testPage(@RequestBody User user){
        System.out.println(user);
        return user;
    }
}
