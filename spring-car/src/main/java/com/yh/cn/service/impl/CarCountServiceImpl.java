package com.yh.cn.service.impl;

import com.yh.cn.dao.CarCountDao;
import com.yh.cn.service.CarCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CarCountServiceImpl implements CarCountService {

    @Autowired
    private CarCountDao carCountDao ;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void subtraction(Integer count) {
        //int j = 1 / 0 ;
        carCountDao.subtraction(count);
    }
}
