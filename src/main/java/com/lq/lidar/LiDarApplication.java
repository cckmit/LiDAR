package com.lq.lidar;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lq.lidar.mapper")
public class LiDarApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiDarApplication.class, args);
    }

}
