package com.kyssion.mybatis.Drive;

import com.kyssion.mybatis.sqlSource.EnhanceSqlSource;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.scripting.xmltags.XMLLanguageDriver;
import org.apache.ibatis.session.Configuration;

public class EnhanceSqlDriver extends XMLLanguageDriver {
    @Override
    public SqlSource createSqlSource(Configuration configuration, String script, Class<?> parameterType) {
        return new EnhanceSqlSource(configuration,script,parameterType);
    }
}
