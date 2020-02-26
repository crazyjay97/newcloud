package com.github.crazyjay97.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.github.crazyjay97.dao.TestDao;
import com.github.crazyjay97.entity.Test;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

@Component
public class TestMutation implements GraphQLMutationResolver {

    @Resource
    private TestDao testDao;

    public boolean addTest(String name,String version) {
        testDao.insert(Test.builder().name(name).version(version).testTime(new Date()).build());
        return true;
    }
}
