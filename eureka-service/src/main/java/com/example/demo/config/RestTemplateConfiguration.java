package com.example.demo.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfiguration {

    @Bean
    //标识开启负载均衡的功能
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
