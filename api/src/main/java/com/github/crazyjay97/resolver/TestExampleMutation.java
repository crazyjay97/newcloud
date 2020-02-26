package com.github.crazyjay97.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.github.crazyjay97.dao.TestExampleDao;
import com.github.crazyjay97.entity.TestExample;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class TestExampleMutation implements GraphQLMutationResolver {

    @Resource
    private TestExampleDao testExampleDao;

    public boolean addExample(int testId, String name, String description) {
        testExampleDao.insert(TestExample.builder().testId(testId).name(name).description(description).build());
        return true;
    }
}
