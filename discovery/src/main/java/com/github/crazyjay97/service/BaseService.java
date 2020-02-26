package com.github.crazyjay97.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class BaseService {

    private static final Logger log = LoggerFactory.getLogger(BaseService.class);

    public void packageAspectTest() {
        log.info("In PackageAspectTest");
        int a = 0 / 0;
    }
}
