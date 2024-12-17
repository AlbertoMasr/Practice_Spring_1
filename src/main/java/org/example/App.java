package org.example;

import org.example.config.AppConfig;
import org.example.service.GreetingService;
import org.example.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

//        // Using XML configuration
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        GreetingService greetingService = context.getBean("greetingService", GreetingService.class);
//
//        greetingService.sayHello();
//
//        // Using Java configuration
//        ApplicationContext context2 = new AnnotationConfigApplicationContext(AppConfig.class);
//
//        GreetingService greetingService2 = context2.getBean(GreetingService.class);
//
//        greetingService2.sayHello();

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);

        userService.getUserDetails();
    }
}