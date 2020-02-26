package com.github.crazyjay97.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.crazyjay97.entity.Test;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface TestDao extends BaseMapper<Test>, IPage<Test> {
}

