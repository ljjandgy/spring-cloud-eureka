package com.springcloud.feign.test;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName EurekaClientFeign
 * @Description
 * @Author ljj
 * @Version V2.0.0
 * @Date 2019-08-04 17:35:57
 */
@FeignClient(value = "eureka-client",path = "eureka/client")
public interface EurekaClientFeign {
    @GetMapping("test")
    public String test();
}
