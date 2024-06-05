package org.ncu.GROCERY.ASPECT;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* org.ncu.GROCERY.CONTROLLER.*.*(..))")
    public void logBeforeControllerMethods(JoinPoint joinPoint) {
        System.out.println("Before calling controller method: " + joinPoint.getSignature().toShortString());
    }

    @Before("execution(* org.ncu.GROCERY.SERVICE.*.*(..))")
    public void logBeforeServiceMethods(JoinPoint joinPoint) {
        System.out.println("Before calling service method: " + joinPoint.getSignature().toShortString());
    }

    @Before("execution(* org.ncu.GROCERY.DAO.*.*(..))")
    public void logBeforeDAOMethods(JoinPoint joinPoint) {
        System.out.println("Before calling DAO method: " + joinPoint.getSignature().toShortString());
    }

    @Before("execution(* org.ncu.GROCERY.*.*.*(..)) && !execution(* org.ncu.GROCERY.ASPECT.*.*(..))")
    public void logBeforeAllMethodsExceptAspect(JoinPoint joinPoint) {
        System.out.println("Before calling method: " + joinPoint.getSignature().toShortString());
    }

    @Before("within(org.ncu.GROCERY.ASPECT..*)")
    public void logWithinAspectPackage(JoinPoint joinPoint) {
        System.out.println("Within aspect package: " + joinPoint.getSignature().toShortString());
    }

    @After("execution(* org.ncu.GROCERY.*.*.*(..))")
    public void logAfterAllMethods(JoinPoint joinPoint) {
        System.out.println("After calling method: " + joinPoint.getSignature().toShortString());
    }

    @AfterThrowing(pointcut = "execution(* org.ncu.GROCERY.*.*.*(..))", throwing = "ex")
    public void logAfterThrowingAllMethods(JoinPoint joinPoint, Exception ex) {
        System.out.println("After throwing exception in method: " + joinPoint.getSignature().toShortString());
        System.out.println("Exception message: " + ex.getMessage());
    }

    @AfterReturning(pointcut = "execution(* org.ncu.GROCERY.*.*.*(..))", returning = "result")
    public void logAfterReturningAllMethods(JoinPoint joinPoint, Object result) {
        System.out.println("After returning from method: " + joinPoint.getSignature().toShortString());
        System.out.println("Returned value: " + result);
    }

    @Around("execution(* org.ncu.GROCERY.*.*.*(..))")
    public Object logAroundAllMethods(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Before around method: " + joinPoint.getSignature().toShortString());
        Object result = joinPoint.proceed();
        System.out.println("After around method: " + joinPoint.getSignature().toShortString());
        return result;
    }
}
