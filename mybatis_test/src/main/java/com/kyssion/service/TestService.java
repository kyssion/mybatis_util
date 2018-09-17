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
        testBean.setId(123);
        testMapper.getMapperById(new TestBean());
    }

    public void test2(){
        testMapper.getMapperById2();
    }
}
