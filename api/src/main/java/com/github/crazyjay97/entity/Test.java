package com.github.crazyjay97.entity;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Test {
    private Integer id;
    private String name;
    private String version;
    private long testTime;
}
