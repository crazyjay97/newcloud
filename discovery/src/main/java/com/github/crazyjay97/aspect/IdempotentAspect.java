package com.github.crazyjay97.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class IdempotentAspect {

    private static final Logger log = LoggerFactory.getLogger(IdempotentAspect.class);

    @Pointcut("within(com.github.crazyjay97.service..*)")
    public void packageAspectTest() {
        log.info("Pointcut: PackageAspectTest");
    }

    @Before("packageAspectTest()")
    public void packageAspectTestBefore() {
        log.info("Before: PackageAspectTest");
    }

    @After("packageAspectTest()")
    public void packageAspectTestAfter() {
        log.info("After: PackageAspectTest");
    }
}
