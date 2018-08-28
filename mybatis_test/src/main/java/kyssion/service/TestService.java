package kyssion.service;

import kyssion.bean.TestBean;
import kyssion.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    TestMapper testMapper;

    public TestBean test(){
        TestBean bean = new TestBean();
        bean.setId(1);
        bean.setItem("sfsddf");
        bean.setMoney(1000);
        bean.setName("jackl");
        TestBean bean1 = testMapper.getMapperById(bean);
        return bean1;
    }
}
