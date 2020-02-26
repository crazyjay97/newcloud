package com.github.crazyjay97.controller;

import com.github.crazyjay97.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @Autowired
    private BaseService baseService;

    @GetMapping("get/{number}")
    public String get(@PathVariable String number) {
        return new StringBuffer("You Number Is ").append(number).toString();
    }

    @GetMapping("packageAspectTest")
    public String packageAspectTest() {
        baseService.packageAspectTest();
        return "SUCCESS";
    }
}
