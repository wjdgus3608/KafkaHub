package com.jung.kafka.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jung.kafka.service.GenerateAuthNumberProducer;


@RestController
@RequestMapping(value = "/req-authnumber")
public class GenerateAuthNumberController {
	@Autowired
	private GenerateAuthNumberProducer producer;
	
	@PostMapping
    public String sendMessage(@RequestBody Map<String,String> map) {
        producer.sendMessage(map);
        return "success";
    }
	
}
