package com.yh.cn.controller;

import com.yh.cn.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/stock")
public class StockController {

    @Autowired
    private StockService stockService ;

    @RequestMapping(value = "/subtraction")
    public String subtraction(@RequestParam(name = "count") Integer count){
        stockService.subtraction(count);
        return "success";
    }
}
