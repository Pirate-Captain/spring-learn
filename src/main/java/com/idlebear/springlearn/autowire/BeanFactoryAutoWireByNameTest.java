/*
 * iaskbear
 * Created on 2020-09-21
 */
package com.idlebear.springlearn.autowire;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author iaskbear <a href="mailto:iaskbear@google.com">iaskbear</a>
 * @version $Id$
 */
public class BeanFactoryAutoWireByNameTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("autowire/autowirebyname.xml");
        AutoWireEmployer employer = (AutoWireEmployer) context.getBean("autoWireEmployer");
        System.out.println(employer.getAutoWireEmployee().getName());
    }
}