package com.github.crazyjay97.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.github.crazyjay97.entity.TestExample;
import com.github.crazyjay97.entity.Test;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class TestResolver implements GraphQLQueryResolver {

    public List<Test> listTest(int count) {
        TestExample example = TestExample.builder().id(10000).name("Test 001").desc("Unit Test").build();
        Test test = Test.builder().id(1).version("1.0.0").name("test").testTime(System.currentTimeMillis()).build();
        return Arrays.asList(new Test[]{test});
    }
}
