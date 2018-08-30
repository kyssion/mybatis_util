package com.kyssion;

import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.scripting.xmltags.DynamicSqlSource;
import org.apache.ibatis.scripting.xmltags.XMLLanguageDriver;
import org.apache.ibatis.session.Configuration;

import java.util.HashMap;

public class RoseLangageDriver extends XMLLanguageDriver {
    public SqlSource createSqlSource(Configuration configuration, String script, Class<?> parameterType) {
        return null;
    }
}
