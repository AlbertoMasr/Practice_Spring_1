package org.example.config;

//import org.example.service.GreetingService;
//import org.example.service.GreetingServiceImpl;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class AppConfig {
//    @Bean
//    public GreetingService greetingService() {
//        return new GreetingServiceImpl();
//    }
//}

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "org.example")
@EnableAspectJAutoProxy
public class AppConfig {
}