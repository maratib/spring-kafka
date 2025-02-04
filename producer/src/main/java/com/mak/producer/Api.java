package com.mak.producer;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequiredArgsConstructor
public class Api {
    
    private final Producer producer;

    @GetMapping
    public String getMethodName() {
        return new String("Kafka Message Producer Version : 0.1");
    }

    @GetMapping("/send")
    public String send() {
        producer.sendMessage("demoTopic", "email", "Key is email");
        return "Message sent";
    }

    @GetMapping("/send1")
    public String send1() {
        producer.sendMessage("demoTopic", "banking", "Key is banking");
        return "Message sent";
    }
    
}
