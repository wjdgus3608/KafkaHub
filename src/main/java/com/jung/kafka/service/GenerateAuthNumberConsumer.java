package com.jung.kafka.service;

import java.io.IOException;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.jung.util.JsonUtil;

@Service
public class GenerateAuthNumberConsumer {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(GenerateAuthNumberConsumer.class);

    @KafkaListener(topics = "generateAuthNumber", groupId = "generateAuthNumberGroup", concurrency = "4")
    public void consume(String message) throws IOException {
    	Map<String,String> json = JsonUtil.stringToJson(message);
        LOGGER.info("Consumed message : "+json);
    }
    
    
}