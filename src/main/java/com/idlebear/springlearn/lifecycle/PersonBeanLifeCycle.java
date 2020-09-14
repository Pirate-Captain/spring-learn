/*
 * chsi
 * Created on 2020-09-10
 */
package com.idlebear.springlearn.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author iaskbear <a href="mailto:iaskbear@google.com">iaskbear</a>
 * @version $Id$
 */
public class PersonBeanLifeCycle implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    private String name;
    private PersonalAddressBean addressBean;

    public PersonBeanLifeCycle() {
        System.out.println("invoke constructor ");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("set property name：" + name);
    }

    public void setAddressBean(PersonalAddressBean addressBean) {
        this.addressBean = addressBean;
        System.out.println("set property addressBean");
    }

    public void myInit() {
        System.out.println("invoke init ");
    }

    public void myDestroy() {
        System.out.println("invoke my destroy");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("invoke setBeanFactory");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("invoke setBeanName");
    }

    @Override
    public void destroy() {
        System.out.println("invoke destroy");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("invoke afterPropertiesSet");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("invoke applicationContext");
    }
}