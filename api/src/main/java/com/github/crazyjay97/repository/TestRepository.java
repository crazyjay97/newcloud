package com.github.crazyjay97.repository;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.coxautodev.graphql.tools.GraphQLResolver;
import com.github.crazyjay97.dao.TestExampleDao;
import com.github.crazyjay97.entity.Test;
import com.github.crazyjay97.entity.TestExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Repository
public class TestRepository implements GraphQLResolver<Test> {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Resource
    private TestExampleDao testExampleDao;

    public List<TestExample> getExample(Test model) {
        log.info(new StringBuilder("In TestResolver").append("***********************").append(new Date()).toString());
        log.info(model.toString());
        return testExampleDao.selectList(new QueryWrapper<TestExample>().eq("TEST_ID", model.getId()));
    }

    public long getTestTime(Test test) {
        return test.getTestTime().getTime();
    }
}
