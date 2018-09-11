package com.kyssion;

import com.kyssion.mapper.TestMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.io.InputStream;

@SpringBootApplication
@MapperScan("com.kyssion.mapper")
public class SpringMybatisMain implements CommandLineRunner {
    @Autowired
    TestMapper mapper;
    public static void main(String[] args) {
        SpringApplication.run(SpringMybatisMain.class);
    }

    @Override
    public void run(String... args) throws Exception {
        mapper.selectOne("sdfsdf");
    }

    public void test() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("map/TestMapper.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlsession = factory.openSession();
        TestMapper mapper = sqlsession.getMapper(TestMapper.class);
    }

    public void test2() throws Exception {
        SqlSessionFactory factoryBean = new SqlSessionFactoryBean().getObject();
        MapperFactoryBean mapperFactoryBean = new MapperFactoryBean();
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(factoryBean);
        MapperScannerConfigurer mapperScaner = new MapperScannerConfigurer();
    }
}
