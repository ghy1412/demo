package com.cn.service;

import com.cn.po.Items;
import com.cn.po.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public interface ItemsService {
    List<Items> queryItems() throws Exception;
}
