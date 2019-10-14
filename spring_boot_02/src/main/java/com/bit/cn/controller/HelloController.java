package com.bit.cn.controller;


import com.bit.cn.po.ShaGou;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*这个注解可是很神奇的, 是Controller 和  @ResponseBody的组合*/
@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String  sayHello(){
        return "Hello World, start quick!";
    }
}
