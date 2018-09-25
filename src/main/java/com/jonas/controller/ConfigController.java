package com.jonas.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2018/05/17
 */
@RestController
public class ConfigController {

    @Value("${foo}")
    private String foo;

    @RequestMapping("/hi")
    public String hi() {
        return foo;
    }
}
