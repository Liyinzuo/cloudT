package com.example.demo.control;

import com.example.demo.service.EurekaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class RibbonController {

    @Resource
    private EurekaService eurekaService;

    @GetMapping("/RIBBONFEIGN")
    public String ri() {
        return eurekaService.sayHi();
    }
}
