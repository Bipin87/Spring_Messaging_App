package com.capgemini.Spring_Messaging_Application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// UC 3: GET request with path variable
@RestController
@RequestMapping("/hello/param")
class HelloControllerUC3 {
    @GetMapping("/{name}")
    public String sayHelloPath(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}