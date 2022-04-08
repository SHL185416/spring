package com.tryL9.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//切面
@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.tryL9.service.UserServiceImpl.*(..))")
    public void beforeLog(){
        System.out.println("方法前 beforeLog AnnotationPointCut");
    }
    @After("execution(* com.tryL9.service.UserServiceImpl.*(..))")
    public void afterLog(){
        System.out.println("方法后 afterLog AnnotationPointCut");
    }


    //设置切入的点的位置
   @Around("execution(* com.tryL9.service.UserServiceImpl.*(..))")
    public void aroundLog(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("===around Before");
        //执行方法
        Object proceed = joinPoint.proceed();
        System.out.println("===around After");

    }
}
