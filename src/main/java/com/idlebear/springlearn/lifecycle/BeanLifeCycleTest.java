/*
 * chsi
 * Created on 2020-09-10
 */
package com.idlebear.springlearn.lifecycle;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author iaskbear <a href="mailto:iaskbear@google.com">iaskbear</a>
 * @version $Id$
 */
public class BeanLifeCycleTest {
    public static void main(String[] args) {
        // ApplicatonContext
        applicationContext();

        // BeanFactory
//        beanFactory();
    }

    private static void applicationContext() {
        System.out.println("before start ioc");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanlifecycle.xml");
        System.out.println("after start ioc");
        PersonBeanLifeCycle lifeCycle = (PersonBeanLifeCycle) context.getBean("beanLifeCycle");
        System.out.println("after get bean");
        context.destroy();
        System.out.println("after destroy context");
    }

    private static void beanFactory() {
        System.out.println("before start ioc");
        ConfigurableListableBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beanlifecycle.xml"));
        System.out.println("after start ioc");
        // 需要手动将beanPostProcessor设置到BeanFactory中

        beanFactory.addBeanPostProcessor((BeanPostProcessor) beanFactory.getBean("personBeanPostProcessor"));
        PersonBeanLifeCycle lifeCycle = (PersonBeanLifeCycle) beanFactory.getBean("beanLifeCycle");
        System.out.println("after get bean");
        beanFactory.destroySingletons();
        System.out.println("after destroy context");
    }
}