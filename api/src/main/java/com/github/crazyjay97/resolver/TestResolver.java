package com.github.crazyjay97.resolver;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.github.crazyjay97.dao.TestDao;
import com.github.crazyjay97.entity.Test;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class TestResolver implements GraphQLQueryResolver {

    @Resource
    private TestDao testDao;

    public List<Test> listTest(int page, int size) {
        Page p = new Page<Test>();
        p.setCurrent(page);
        p.setSize(size);
        p = testDao.selectPage(p, new QueryWrapper<Test>());
        return p.getRecords();
    }
}
