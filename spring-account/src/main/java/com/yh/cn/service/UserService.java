package com.yh.cn.service;

import com.yh.cn.model.UserModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface UserService {
    List<UserModel> getAll();

    int save(UserModel model);
}
