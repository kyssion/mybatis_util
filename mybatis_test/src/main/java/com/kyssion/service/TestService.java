package com.kyssion.service;

import com.kyssion.bean.TestBean;
import com.kyssion.mapper.TestMapper;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static org.apache.ibatis.reflection.SystemMetaObject.DEFAULT_OBJECT_FACTORY;

@Service
public class TestService {
    @Autowired
    TestMapper testMapper;

    public TestBean test(){
        TestBean bean = new TestBean();
        bean.setId(1);
        bean.setItem("sfsddf");
        bean.setMoney(1000);
        bean.setName("jackl");
        TestBean bean1 = testMapper.getMapperById(bean);
        return bean1;
    }
    public TestBean test2(){
        TestBean bean = new TestBean();
        bean.setId(1);
        bean.setItem("sfsddf");
        bean.setMoney(1000);
        bean.setName("jackl");
        TestBean bean1 = testMapper.getMapperById2(bean);
        return bean1;
    }
}