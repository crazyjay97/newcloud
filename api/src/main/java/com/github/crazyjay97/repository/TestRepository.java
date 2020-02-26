package com.github.crazyjay97.repository;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.github.crazyjay97.model.TestExampleModel;
import com.github.crazyjay97.model.TestModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class TestRepository implements GraphQLResolver<TestModel> {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    public TestExampleModel getExample(TestModel model) {
        log.info(new StringBuilder("In TestResolver").append("***********************").append(new Date()).toString());
        log.info(model.toString());
        return TestExampleModel.builder().desc("Test Resolver").id(3000).name("Love 3000 Times").build();
    }
}
