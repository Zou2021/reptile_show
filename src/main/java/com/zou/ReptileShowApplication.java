package com.zou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.zou.controller"})
@MapperScan("com.zou.mapper")
public class ReptileShowApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReptileShowApplication.class, args);
    }

}
