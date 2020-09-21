/*
 * iaskbear
 * Created on 2020-09-17
 */
package com.idlebear.springlearn.aop.basic;

import com.idlebear.springlearn.aop.AopTargetInterface;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author iaskbear <a href="mailto:iaskbear@google.com">iaskbear</a>
 * @version $Id$
 */
public class AopAdivceBasicTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aop/aop-basic.xml");
        AopTargetInterface aopTargetInterface = (AopTargetInterface) context.getBean("aopTargetInterfaceProxy");
        aopTargetInterface.add();
    }
}