package com.cn.controller;

import com.cn.po.Account;
import com.cn.po.Items;
import com.cn.po.User;
import com.cn.service.ItemsService;
import com.cn.service.serviceImpl.ItemsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class DemoController {
    @Autowired
    private ItemsServiceImpl itemsService;
    @RequestMapping("/demo")
    public void demo(Account account) throws Exception {

        System.out.println(account);
    }

    @RequestMapping("/queryI")
    public ModelAndView query(String name) throws Exception {

        List<Items> list = itemsService.queryItems();
        System.out.println(name);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("items");
        modelAndView.addObject("list",list);
        return modelAndView;
    }
}
