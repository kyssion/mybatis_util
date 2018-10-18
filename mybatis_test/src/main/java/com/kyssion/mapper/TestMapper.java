package com.kyssion.mapper;

import com.kyssion.bean.TestBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TestMapper {
    @Select("select * from new_test where name = #{name}")
    TestBean getMapperById(TestBean bean);

    @Select("select * from new_test where name = #{name} and password= #{password}")
    TestBean getMapperById2(@Param("name") String name, @Param("password") String password);
}
