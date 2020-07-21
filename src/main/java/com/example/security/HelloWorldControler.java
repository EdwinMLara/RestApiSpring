package com.example.security;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldControler {
    @RequestMapping(value = "/")
    public String firstPage(){
        return "Hello World!";
    }
}