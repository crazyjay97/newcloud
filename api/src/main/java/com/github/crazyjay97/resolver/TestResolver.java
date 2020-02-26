package com.github.crazyjay97.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.github.crazyjay97.model.TestExampleModel;
import com.github.crazyjay97.model.TestModel;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class TestResolver implements GraphQLQueryResolver {

    public List<TestModel> listTest(int count) {
        TestExampleModel example = TestExampleModel.builder().id(10000).name("Test 001").desc("Unit Test").build();
        TestModel test = TestModel.builder().id(1).version("1.0.0").name("test").testTime(System.currentTimeMillis()).example(example).build();
        return Arrays.asList(new TestModel[]{test});
    }
}
