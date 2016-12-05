package com.yingjun.test.service;

import com.yingjun.test.dao.Test2Mapper;
import com.yingjun.test.model.Test2;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestServiceImpl {
    @Resource
    private Test2Mapper test2Mapper;

    public int insert(){
        Test2 test21 = new Test2();
        test21.setAge("11");
        test21.setName("11");
        int insert = test2Mapper.insert(test21);
        if(insert==1){
            throw new RuntimeException("111111111111111111111111");
        }
        return insert;

    }
}
