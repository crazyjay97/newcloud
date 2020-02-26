package com.github.crazyjay97.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TestModel {
    private Integer id;
    private String name;
    private String version;
    private long testTime;
    private TestExampleModel example;
}
