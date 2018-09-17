package com.kyssion.mybatis.sqlSource;

import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.session.Configuration;


public class EnhanceSqlSource implements SqlSource {
    public EnhanceSqlSource(Configuration configuration, String script, Class<?> parameterType){

    }
    @Override
    public BoundSql getBoundSql(Object parameterObject) {

        return null;
    }
}
