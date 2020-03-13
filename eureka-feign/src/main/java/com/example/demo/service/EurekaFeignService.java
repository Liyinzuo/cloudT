package com.example.demo.service;

import com.example.demo.service.hystrixInter.EurekaFeignHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "eureka-client", fallback = EurekaFeignHystrix.class)
//robbin与feign两种不同消费实现模式
public interface EurekaFeignService {

    @RequestMapping(value = "/dc", method = RequestMethod.GET)
    public String dc();
}
