package com.github.crazyjay97.resolver;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.github.crazyjay97.dao.TestDao;
import com.github.crazyjay97.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TestResolver implements GraphQLQueryResolver {

    @Autowired
    private TestDao testDao;

    public List<Test> listTest(int page, int size) {
        Page<Test> rs = testDao.selectPage(new Page<Test>() {{
            setSize(size);
            setPages(page);
        }}, new QueryWrapper<Test>());
        return rs.getRecords();
    }
}
