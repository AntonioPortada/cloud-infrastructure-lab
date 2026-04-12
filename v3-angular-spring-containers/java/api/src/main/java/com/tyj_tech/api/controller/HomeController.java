package com.tyj_tech.api.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HomeController {

    @GetMapping("/")
    public String getMethodName() {
        return "Welcome to api";
    }
    
}
