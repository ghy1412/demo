package com.cn.controller;

import com.cn.po.Account;
import com.cn.po.Items;
import com.cn.po.User;
import com.cn.service.ItemsService;
import com.cn.service.serviceImpl.ItemsServiceImpl;
import com.oracle.deploy.update.UpdateCheckFactory;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.UUID;

@Controller
public class DemoController {
    @Autowired
    private ItemsServiceImpl itemsService;
    @RequestMapping("/demo")
    public void demo(Account account) throws Exception {
        System.out.println(account);
    }

    @RequestMapping("/queryI")
    public ModelAndView query(@RequestParam(value = "name") String username, Model model) throws Exception {

        model.addAttribute("wanmei", "我喜欢你啊");
       // List<Items> list = itemsService.queryItems();
        System.out.println(username);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("success");
        //modelAndView.addObject("list",list);
        return modelAndView;
    }

    @RequestMapping("/testAjax")
    public @ResponseBody Account testAjax(@RequestBody Account account) throws Exception {
        System.out.println(account);
        account.setName("zhangsan");
        return account;
    }
    @RequestMapping("/uploadfile")
    public String uploadfile(HttpServletRequest request) throws Exception {
        //C:\Users\someonexmh\Desktop
        //String realPath = request.getSession().getServletContext().getRealPath("/uploads/");
        String realPath = "C:\\Users\\someonexmh\\Desktop\\uploads";
        File file = new File(realPath);
        if (!file.exists()){
            file.mkdirs();
        }
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload fileUpload = new ServletFileUpload(factory);

        List<FileItem> items = fileUpload.parseRequest(request);
        for (FileItem fileItem : items){
            if (!fileItem.isFormField()){
                String name = fileItem.getName();
                String s = UUID.randomUUID().toString().replaceAll("-", "");
                name = s+name;
                fileItem.write(new File(realPath,name));
                fileItem.delete();
            }
        }
        return "success";
    }

    @RequestMapping("/uploadfile2")
    public String uploadfile2(HttpServletRequest request, MultipartFile upload) throws Exception {
        //C:\Users\someonexmh\Desktop
        //String realPath = request.getSession().getServletContext().getRealPath("/uploads/");
        String realPath = "C:\\Users\\someonexmh\\Desktop\\uploads";
        File file = new File(realPath);
        if (!file.exists()){
            file.mkdirs();
        }
        String name = upload.getOriginalFilename();
        String s = UUID.randomUUID().toString().replaceAll("-", "");
        name = s+name;
        upload.transferTo(new File(realPath, name));
        return "success";
    }
}
