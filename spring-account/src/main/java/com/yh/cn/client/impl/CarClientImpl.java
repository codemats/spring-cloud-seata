package com.yh.cn.client.impl;

import com.yh.cn.client.CarClient;
import org.springframework.stereotype.Service;

@Service
public class CarClientImpl implements CarClient {
    @Override
    public String subtraction() {
        return "系统繁忙，请稍后再试...CarClientImpl.subtraction";
    }
}
