package com.kyssion.mapper;

import com.kyssion.bean.TestBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TestMapper {
    @Select("select * from new_test where name = #{id}")
    TestBean getMapperById(TestBean bean);

    @Select("select * from xm_test_item")
    TestBean getMapperById2();
}
