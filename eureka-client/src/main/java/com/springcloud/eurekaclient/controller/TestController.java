package com.springcloud.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description
 * @Author ljj
 * @Version V2.0.0
 * @Date 2019-08-04 17:32:13
 */
@RestController
@RequestMapping("test")
public class TestController {
    @GetMapping
    public String test(){
        return "this eureka client service!";
    }

}
