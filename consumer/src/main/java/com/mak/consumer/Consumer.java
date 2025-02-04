package com.mak.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "demoTopic", groupId = "email")
    public void listen(ConsumerRecord<String, String> record) {
        System.out.println("Consumer groupId email :" + " Key: (" + record.key() +  ") and Value: " + record.value());
    }
    
}
