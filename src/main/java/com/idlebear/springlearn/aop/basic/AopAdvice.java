/*
 * iaskbear
 * Created on 2020-09-17
 */
package com.idlebear.springlearn.aop.basic;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author iaskbear <a href="mailto:iaskbear@google.com">iaskbear</a>
 * @version $Id$
 */
public class AopAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(method.getName() + " before advice");
    }
}