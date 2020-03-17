package com.example.demo.control;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @Value("${foo}")
    private String foo;

    @GetMapping("config/foo")
    public String foo() {
        return foo;
    }
}
