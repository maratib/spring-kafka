package com.mak.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer1 {

    @KafkaListener(topics = "demoTopic", groupId = "banking")
    public void listen(ConsumerRecord<String, String> record) {
        System.out.println("Consumer groupId banking :" + " Key: (" + record.key() +  ") and Value: " + record.value());
    }
    
}
