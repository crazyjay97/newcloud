package com.github.crazyjay97.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TestExampleModel {
    private Integer id;
    private String name;
    private String desc;
}
