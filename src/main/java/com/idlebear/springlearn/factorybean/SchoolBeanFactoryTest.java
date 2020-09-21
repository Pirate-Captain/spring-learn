/*
 * iaskbear
 * Created on 2019-09-25
 */
package com.idlebear.springlearn.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author iaskbear <a href="mailto:iaskbear@google.com">iaskbear</a>
 * @version $Id$
 */
public class SchoolBeanFactoryTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("factoryBean.xml");
        Object object1 = context.getBean("schoolFactoryBean");
        System.out.println(object1);

        Object object2 = context.getBean("&schoolFactoryBean");
        System.out.println(object2);
    }
}