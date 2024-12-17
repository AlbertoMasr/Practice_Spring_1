package org.example.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogginAspect {
    @Before("execution(* org.example.service.*.*(..))")
    public void logBeforeMethod() {
        System.out.println("Logging before method execution");
    }

    @After("execution(* org.example.service.*.*(..))")
    public void logAfterMethod() {
        System.out.println("Logging after method execution");
    }
}
