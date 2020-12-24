package com.foody.microservices.micro1.rest;

import com.foody.microservices.micro1.config.CustomConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    CustomConfig custom;

    @GetMapping("")
    public CustomConfig getConfig(){
        return custom;
    }
}

