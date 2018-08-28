package kyssion.mapper;

import kyssion.bean.TestBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TestMapper {
    @Select("select * from mybatis_test where id = #{id}")
    TestBean getMapperById(TestBean bean);
}
