package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class EurekaService {

    @Resource
    private RestTemplate restTemplate;

    public String sayHi() {
        return restTemplate.getForObject("http://eureka-client/dc", String.class);
    }
}
