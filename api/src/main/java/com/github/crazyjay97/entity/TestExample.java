package com.github.crazyjay97.entity;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TestExample {
    private Integer id;
    private String name;
    private String desc;
}
