package com.example.demo.control;

import com.example.demo.service.EurekaFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class feignController {

    @Resource
    private EurekaFeignService eurekaFeignService;

    @GetMapping(value = "/fei")
    public String fei() {
        return eurekaFeignService.dc();
    }
}
