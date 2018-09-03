package com.kyssion;

import com.kyssion.service.TestService;
import org.apache.ibatis.reflection.wrapper.ObjectWrapperFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kyssion.mapper")
public class MybatisTestApplication implements CommandLineRunner {
    @Autowired
    TestService testService;
    public static void main(String[] args) {
        SpringApplication.run(MybatisTestApplication.class);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(testService.test().getName());
        SqlSession
//        System.out.println(testService.test2().getName());
    }
}
