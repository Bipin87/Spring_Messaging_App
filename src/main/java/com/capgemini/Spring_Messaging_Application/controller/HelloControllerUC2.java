package com.capgemini.Spring_Messaging_Application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// UC 2: GET request with query parameter
@RestController
@RequestMapping("/hello/query")
class HelloControllerUC2 {
    @GetMapping
    public String sayHelloQuery(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}
