package com.kyssion;

import com.kyssion.mapper.TestMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.TypeHandler;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.InputStream;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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


    public void Test1() throws Exception {
        SqlSessionFactory factoryBean = new SqlSessionFactoryBean().getObject();
        SqlSessionTemplate template =new SqlSessionTemplate(factoryBean);

    }
}
