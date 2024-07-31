package com.klug.producer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @GetMapping("/produce")
    public String produce() {
        return "Hello from Producer!";
    }
}
