package com.uniteam.telegramtemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

// We just enable feign clients
@EnableFeignClients
@SpringBootApplication
public class TelegramTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(TelegramTemplateApplication.class, args);
    }

}
