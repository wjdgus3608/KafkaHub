package com.jung.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jung.kafka.service.GenerateAuthNumberProducer;


@RestController
@RequestMapping(value = "/authNumber")
public class GenerateAuthNumberController {
	@Autowired
	private GenerateAuthNumberProducer producer;
	
	@PostMapping
    public String sendMessage(@RequestParam("message") String message) {
        producer.sendMessage(message);
        return "success";
    }
	
}
