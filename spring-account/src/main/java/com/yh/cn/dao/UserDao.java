package com.yh.cn.dao;

import com.yh.cn.model.UserModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    List<UserModel> getAll();

    int save(UserModel model);
}
