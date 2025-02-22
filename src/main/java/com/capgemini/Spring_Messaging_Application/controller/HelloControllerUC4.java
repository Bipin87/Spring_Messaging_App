package com.capgemini.Spring_Messaging_Application.controller;

import com.capgemini.Spring_Messaging_Application.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// UC 4: POST request with request body
@RestController
@RequestMapping("/hello/post")
class HelloControllerUC4 {
    @PostMapping
    public static String sayHelloPost(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
}