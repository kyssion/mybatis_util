package com.kyssion.service;

import com.kyssion.bean.TestBean;
import com.kyssion.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    TestMapper testMapper;

    public void test(){
        TestBean testBean  = new TestBean();
        testBean.setPassword("14159265jkl");
        testBean.setName("tom");
        testMapper.getMapperById(new TestBean());
    }

    public void test2(){
        testMapper.getMapperById2("tom","14159265jkl");
    }
}
