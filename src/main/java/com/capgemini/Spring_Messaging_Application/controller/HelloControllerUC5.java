package com.capgemini.Spring_Messaging_Application.controller;

import org.springframework.web.bind.annotation.*;

// UC 5: PUT request with path variable and query parameter
@RestController
@RequestMapping("/hello/put")
public class HelloControllerUC5 {
    @PutMapping("/{firstName}")
    public String sayHelloPut(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }


}