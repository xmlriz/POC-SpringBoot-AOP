package com.user.userAOP.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.user.userAOP.service.*.*(..))")
    public void beforeSaveUser()
    {
        System.out.println("================ before user saving =================");
    }
}
