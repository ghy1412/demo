package com.cn.service.serviceImpl;

import com.cn.mapper.ItemsMapper;
import com.cn.po.Items;
import com.cn.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsMapper itemsMapper;

    public List<Items> queryItems() throws Exception {
       return itemsMapper.queryItems();
    }
}
