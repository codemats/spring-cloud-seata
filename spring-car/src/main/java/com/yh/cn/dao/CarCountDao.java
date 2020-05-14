package com.yh.cn.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CarCountDao {

    void subtraction(@Param(value = "countNum") Integer countNum );

}
