/*
 * chsi
 * Created on 2019-11-11
 */
package com.idlebear.springlearn.beanfactory;

import com.idlebear.springlearn.bean.PersonInfo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhuyl <a href="mailto:zhuyl@chsi.com.cn">zhu Youliang</a>
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