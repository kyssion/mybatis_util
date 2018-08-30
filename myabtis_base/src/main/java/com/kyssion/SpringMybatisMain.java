package com.kyssion;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.InputStream;

public class SpringMybatisMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(new Configuration());
        SqlSession sqlSession = factory.openSession();
    }
}
