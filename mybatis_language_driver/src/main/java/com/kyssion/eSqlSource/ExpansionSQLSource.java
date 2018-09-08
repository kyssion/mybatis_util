package com.kyssion.eSqlSource;

import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.mapping.SqlSource;

import javax.security.auth.login.Configuration;

public class ExpansionSQLSource implements SqlSource {

    protected static Configuration configuration;
    protected ParameterMapping[] parameterMappings;


    public ExpansionSQLSource(){

    }

    @Override
    public BoundSql getBoundSql(Object parameterObject) {
        return null;
    }
}
