package com.yh.cn.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StockDao {

    int subtraction(@Param(value = "countNum") Integer countNum);

}
