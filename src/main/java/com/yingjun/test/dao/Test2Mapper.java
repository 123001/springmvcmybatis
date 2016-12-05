package com.yingjun.test.dao;

import com.yingjun.test.model.Test2;

import java.util.List;

public interface Test2Mapper {
    int insert(Test2 record);

    int insertSelective(Test2 record);

    List select();
}