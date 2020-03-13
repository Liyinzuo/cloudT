package com.example.demo.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class EurekaService {

    @Resource
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "sayHiError")
    public String sayHi() {
        return restTemplate.getForObject("http://eureka-client/dc", String.class);
    }

    public String sayHiError() {
        return "ribbon say hi Error -->>";
    }
}
