package com.foody.microservices.micro1.rest;

import com.foody.microservices.micro1.config.CustomConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Value("${cc.micro1.maximum}")
    int max;
    @Value("${cc.micro1.minimum}")
    int min;

    @Autowired
    CustomConfig cc;

    @RequestMapping()
    public CustomConfig getConfig(){
        return cc;
    }
}
