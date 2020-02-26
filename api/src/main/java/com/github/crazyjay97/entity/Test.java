package com.github.crazyjay97.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
@TableName("sys_test")
public class Test {
    private Integer id;
    private String name;
    private String version;
    private Date testTime;
}
