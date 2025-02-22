package com.capgemini.Spring_Messaging_Application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// UC 1: Simple GET request
@RestController
@RequestMapping("/hello")
class HelloControllerUC1 {
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
}