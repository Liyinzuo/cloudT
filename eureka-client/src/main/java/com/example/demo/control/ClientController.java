package com.example.demo.control;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ClientController {

    private static Logger logger = LoggerFactory.getLogger(ClientController.class);

    @Resource
    DiscoveryClient discoveryClient;
    @Value("${server.port}")
    private String port;

    @GetMapping("/dc")
    public String dc() {
        String services = "Services: " + discoveryClient.getServices() + "-- port: " + port;
        logger.info("services: {}", services);
        return services;
    }
}
