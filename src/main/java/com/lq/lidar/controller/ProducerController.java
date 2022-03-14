package com.lq.lidar.controller;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ProducerController {

    @Resource
    KafkaTemplate<String,String> kafkaTemplate;


    @GetMapping("/sendData")
    public String data(String msg){
        kafkaTemplate.send("test",msg);
        return "OK";
    }

    @GetMapping("/kafkaConsumer")
    public String kafkaConsumer(){
        return "OK";

    }
}
