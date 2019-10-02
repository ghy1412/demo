package com.cn.mapper;

import com.cn.po.Items;
import com.cn.po.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ItemsMapper {
     List<User> queryUserList() throws Exception;
     List<Items> queryItems();
}
