package com.springboot.sb_demo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public String myService() {
        return new String("bean string");
    }

}
