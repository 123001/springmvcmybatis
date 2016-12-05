package com.yingjun.test.controller;

import com.yingjun.test.dao.Test2Mapper;
import com.yingjun.test.model.Test2;
import com.yingjun.test.service.TestServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class TestController {



    @Resource
    private Test2Mapper test2Mapper;
    @Resource
    private TestServiceImpl testService;

    @RequestMapping(value = "/test/getInfo", method = RequestMethod.GET)
    @ResponseBody
    public List test() {
        List list = test2Mapper.select();
        Test2 test2 = new Test2();
        test2.setAge("3333");
        test2.setName("33333");
        test2Mapper.insert(test2);
        testService.insert();
        return list;
    }
}
