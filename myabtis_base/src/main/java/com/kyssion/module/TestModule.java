package com.kyssion.module;

import org.apache.ibatis.annotations.Mapper;

public class TestModule {

    private String name;
    private String password;

    @Mapper
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
