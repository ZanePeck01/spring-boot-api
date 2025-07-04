package com.codewithmosh.store.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codewithmosh.store.entities.Message;

@RestController
public class MessageController {
    
    @RequestMapping("/hello")
    // This method handles requests to the /hello URL.
    public Message sayHello() {
        // It returns a simple greeting message.
        return new Message("Hello, World!");
    }
}
