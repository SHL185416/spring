package com.sherlock.diy;

//Annotation 实现 AOP

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//声明式事务
//标注这个类是一个切面
//等同于xml中的配置
@Aspect
public class AnnotationPointCut {


    //"execution(* com.sherlock.service.UserServiceImp.*(..))" is a PoinrCut
    @Before("execution(* com.sherlock.service.UserServiceImp.*(..))")
    public void beforeDIY() {
        System.out.println("===方法前");
    }

    @After("execution(* com.sherlock.service.UserServiceImp.*(..))")
    public void afterDIY() {
        System.out.println("===方法后");
    }

    //设置切入的点的位置
    @Around("execution(* com.sherlock.service.UserServiceImp.*(..))")
    public void aroundDIY(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("===aroundDIY Before");
//        Signature signature = joinPoint.getSignature();
//        System.out.println("signature: "+signature);
        //执行方法
        Object proceed = joinPoint.proceed();

        System.out.println("===aroundDIY After");
//        System.out.println(proceed);
    }
}
