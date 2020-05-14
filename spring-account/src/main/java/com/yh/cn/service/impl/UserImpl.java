package com.yh.cn.service.impl;

import com.yh.cn.client.CarClient;
import com.yh.cn.client.StockClient;
import com.yh.cn.dao.UserDao;
import com.yh.cn.model.UserModel;
import com.yh.cn.service.UserService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserImpl implements UserService {

    @Autowired
  private UserDao userDao ;

    @Autowired
    private CarClient carClient ;

    @Autowired
    private StockClient stockClient ;


    @Override
    public List<UserModel> getAll() {
        return userDao.getAll();
    }

    @Override
    @GlobalTransactional(name = "", rollbackFor = Exception.class)
    public int save(UserModel model) {
        int count = userDao.save(model);
        //用户保存
        System.out.println("数据库保存数据条数："+count);
        //购物车
        String resultCarMessage = carClient.subtraction();
        System.out.println("购物车减:"+resultCarMessage);
        //库存减
        String stockResultMessage = stockClient.subtraction(1);
        System.out.println("库存减:"+stockResultMessage);
        return count;
    }
}
