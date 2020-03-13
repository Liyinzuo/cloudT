package com.example.demo.service.hystrixInter;

import com.example.demo.service.EurekaFeignService;
import org.springframework.stereotype.Component;

@Component
public class EurekaFeignHystrix implements EurekaFeignService {
    @Override
    public String dc() {
        return "error --->>> ";
    }
}
