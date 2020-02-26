package com.github.crazyjay97.repository;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.github.crazyjay97.entity.TestExample;
import com.github.crazyjay97.entity.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class TestRepository implements GraphQLResolver<Test> {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    public TestExample getExample(Test model) {
        log.info(new StringBuilder("In TestResolver").append("***********************").append(new Date()).toString());
        log.info(model.toString());
        return TestExample.builder().desc("Test Resolver").id(3000).name("Love 3000 Times").build();
    }
}
