package com.org.around;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
 
@Aspect
public class TrackOperation {
    @Pointcut("execution(* Operation.*(..))")  
    public void abcpointcut(){}//pointcut name  

    @Around("abcpointcut()")//applying pointcut on after advice  
    public Object myadvice(ProceedingJoinPoint pjp) throws Throwable//it is advice (after advice)  
    {  
        System.out.println("Additional Concern Before calling Actual Method");
        Object obj=pjp.proceed();
        //System.out.println("Method Signature: "  + jp.getSignature());  
        System.out.println("Additional Concern After calling actual method");
        return obj;
    }  
}
