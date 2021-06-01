package com.jung.kafka.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jung.kafka.service.ResponseAuthNumberProducer;


@RestController
@RequestMapping(value = "/res-authnumber")
public class ResponseAuthNumberController {
	@Autowired
	private ResponseAuthNumberProducer producer;
	
	@PostMapping
    public String sendMessage(@RequestBody Map<String,String> map) {
        producer.sendMessage(map);
        return "success";
    }
	
}
