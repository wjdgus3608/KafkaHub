package com.jung.kafka.service;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;




@Service
public class GenerateAuthNumberConsumer {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(GenerateAuthNumberConsumer.class);

    @KafkaListener(topics = "generateAuthNumber", groupId = "generateAuthNumberGroup", concurrency = "4")
    public void consume(String message) throws IOException {
        LOGGER.info("Consumed message : "+message);
    }
    
    
}