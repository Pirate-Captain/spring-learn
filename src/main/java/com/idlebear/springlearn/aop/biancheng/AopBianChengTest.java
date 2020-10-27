/*
 * chsi
 * Created on 2020-10-15
 */
package com.idlebear.springlearn.aop.biancheng;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.PointcutAdvisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.JdkRegexpMethodPointcut;

/**
 * 编程式AOP的应用
 *
 * @author @author iaskbear <a href="mailto:iaskbear@google.com">iaskbear</a>
 * @version $Id$
 */
public class AopBianChengTest {
    public static void main(String[] args) {
        testSingleInterface();
    }

    private static void testSingleInterface() {
        TargetService1 targetService1 = new TargetService1();

        ProxyFactory proxyFactory = new ProxyFactory(targetService1);

        PointcutAdvisor advisor = new PointcutAdvisor() {
            @Override
            public Pointcut getPointcut() {
                JdkRegexpMethodPointcut pointcut = new JdkRegexpMethodPointcut();
                pointcut.setPattern("com.idlebear.springlearn.aop.biancheng.Service1.*");
                return pointcut;
            }

            @Override
            public Advice getAdvice() {
                return new AopAdvice();
            }

            @Override
            public boolean isPerInstance() {
                return false;
            }
        };

        proxyFactory.addAdvisor(advisor);
        proxyFactory.addAdvisor(advisor);

        Service1 service1 = (Service1) proxyFactory.getProxy();
        service1.service1();
    }
}