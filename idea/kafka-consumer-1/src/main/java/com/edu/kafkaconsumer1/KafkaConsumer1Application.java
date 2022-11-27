package com.edu.kafkaconsumer1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class KafkaConsumer1Application {
//    @Autowired
//    private OrderRepository orderRepo;

    public static void main(String[] args) {
        SpringApplication.run(KafkaConsumer1Application.class, args);
    }

    @KafkaListener(topics = "my-topic_oct291651", groupId = "a")
    public void consume(String mess) {
        System.out.println("Consumer-1: " + mess);
       // orderRepo.save();

    }

}
