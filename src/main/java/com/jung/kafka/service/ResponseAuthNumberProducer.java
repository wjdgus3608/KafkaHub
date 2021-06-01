package com.jung.kafka.service;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.jung.util.JsonUtil;

@Service
public class ResponseAuthNumberProducer {
    private static final String TOPIC = "ResponseAuthNumber";
    private static final Logger LOGGER = LoggerFactory.getLogger(GenerateAuthNumberConsumer.class);
    
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(Map<String,String> json) {
    	String message = JsonUtil.jsonToString(json);
        LOGGER.info("Produce message : "+message);
        kafkaTemplate.send(TOPIC, message);
    }
}
