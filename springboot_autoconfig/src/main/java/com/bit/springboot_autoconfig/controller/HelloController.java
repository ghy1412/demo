package com.bit.springboot_autoconfig.controller;

import com.bit.springboot_autoconfig.po.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Map;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello(){
        return "demo";
    }


    @RequestMapping("/thyme")
    public String demoThymeleaf(Map<String, String> map, Model model){
        ArrayList<User> usersList = new ArrayList<>();
        for (int i = 0; i < 14; i++) {
            User user = new User();
            user.setName(i+"nc");
            user.setAge(i+100);
            usersList.add(user);
        }
        model.addAttribute("usersList",usersList);
        map.put("user","我是demoThymeLeft");
        return "demo";
    }

}
