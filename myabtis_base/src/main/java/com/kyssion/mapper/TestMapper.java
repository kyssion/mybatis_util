package com.kyssion.mapper;


import com.kyssion.module.TestModule;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface TestMapper {
    TestModule selectOne(String name);
}
