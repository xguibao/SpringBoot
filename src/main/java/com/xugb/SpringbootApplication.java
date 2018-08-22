package com.xugb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.xugb.mapper.mapper") //mapper的包
public class SpringbootApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootApplication.class, args);
    }
}
