package com.github.crazyjay97.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@TableName("sys_test_example")
public class TestExample {
    private Integer id;
    private Integer testId;
    private String name;
    private String description;
}
