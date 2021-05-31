package com.jung.kafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class GenerateAuthNumberProducer {
    private static final String TOPIC = "generateAuthNumber";
    private static final Logger LOGGER = LoggerFactory.getLogger(GenerateAuthNumberConsumer.class);
    
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        LOGGER.info("Produce message : "+message);
        kafkaTemplate.send(TOPIC, message);
    }
}
