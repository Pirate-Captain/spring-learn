/*
 * chsi
 * Created on 2019-11-11
 */
package com.idlebear.springlearn.beanfactory;

import com.idlebear.springlearn.bean.PersonInfo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author iaskbear <a href="mailto:iaskbear@google.com">iaskbear</a>
 * @version $Id$
 */
public class ClassPathXmlApplicationContextTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonInfo personInfo = (PersonInfo) applicationContext.getBean("personInfo");
        System.out.println(personInfo);
        System.out.println(personInfo.getName());
    }
}