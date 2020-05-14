package com.yh.cn.client;

import com.yh.cn.client.impl.StockClientImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "stock")
public interface StockClient {

    @RequestMapping(value = "/stock/subtraction")
    String subtraction(@RequestParam(name = "count") Integer count);
}
