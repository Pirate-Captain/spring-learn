/*
 * chsi
 * Created on 2020-10-15
 */
package com.idlebear.springlearn.aop.biancheng;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author @author iaskbear <a href="mailto:iaskbear@google.com">iaskbear</a>
 * @version $Id$
 */
public class AopAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) {
        System.out.println(method.getName() + " invoke");
    }
}
