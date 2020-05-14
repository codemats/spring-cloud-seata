package com.yh.cn.controller;


import com.yh.cn.client.CarClient;
import com.yh.cn.client.StockClient;
import com.yh.cn.model.UserModel;
import com.yh.cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping(value = "/account")
public class AccountController {

    @Autowired
    private UserService userService ;

    @RequestMapping(value = "/info")
    public Map<String,Object> accountInfo(){
        Map<String,Object> result = new HashMap<>();
        result.put("status",true);
        result.put("message","操作成功");
        return  result ;
    }

    @RequestMapping(value = "/save")
    public Map<String,Object> save(){
        Map<String,Object> result = new HashMap<>();
        UserModel model = new UserModel();
        model.setAge(20);
        model.setMoney(1000);
        model.setName("李四");
        model.setId(UUID.randomUUID().toString().replaceAll("-",""));
        if (userService.save(model) > 0) {
            result.put("status",true);
            result.put("message","操作成功");
        }else {
            result.put("status",false);
            result.put("message","操作失败");
        }
        return  result ;
    }
}
