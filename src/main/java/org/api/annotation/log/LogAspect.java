package org.api.annotation.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    @Around("@annotation(Log)")
    public Object automaticLog(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Start - " + joinPoint.getSignature());

        var result = joinPoint.proceed();

        System.out.println("End - " + joinPoint.getSignature().getName());

        return result;
    }
}
