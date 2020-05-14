package com.yh.cn.service.impl;


import com.yh.cn.dao.StockDao;
import com.yh.cn.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StockServiceImpl implements StockService {

    @Autowired
    private StockDao stockDao ;
    @Override
    @Transactional(rollbackFor = Exception.class)
    public int subtraction(Integer count) {
        int j = 1 / 0 ;
        return stockDao.subtraction(count);
    }
}
