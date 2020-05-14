package com.yh.cn.controller;

import com.yh.cn.service.CarCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/car")
public class CarController {

    @Autowired
    private CarCountService carCountService ;

    @RequestMapping(value = "/subtraction")
    public String subtraction(){
        carCountService.subtraction(1);
        return "success";
    }

}
