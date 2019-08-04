package com.springcloud.feign.controller;

import com.springcloud.feign.test.EurekaClientFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestFeignController
 * @Description
 * @Author ljj
 * @Version V2.0.0
 * @Date 2019-08-04 17:43:14
 */
@RestController
@RequestMapping("test")
public class TestFeignController {
    private final EurekaClientFeign eurekaClientFeign;

    public TestFeignController(EurekaClientFeign eurekaClientFeign){
        this.eurekaClientFeign = eurekaClientFeign;
    }
    @GetMapping
    public String test(){
        return eurekaClientFeign.test();
    }
}
