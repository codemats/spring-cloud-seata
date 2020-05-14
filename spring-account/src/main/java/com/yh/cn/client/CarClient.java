package com.yh.cn.client;

import com.yh.cn.client.impl.CarClientImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "car",fallback = CarClientImpl.class)
public interface CarClient {

    @RequestMapping(value = "/car/subtraction")
    String subtraction();

}
