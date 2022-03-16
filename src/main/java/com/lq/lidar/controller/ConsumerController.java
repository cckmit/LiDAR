//package com.lq.lidar.controller;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//
//@Configuration
//public class ConsumerController {
//
//
//    @KafkaListener(topics = "test")
//    public void consumer(String msg){
//        System.out.println("收到消息msg：" +msg);
//    }
//}
