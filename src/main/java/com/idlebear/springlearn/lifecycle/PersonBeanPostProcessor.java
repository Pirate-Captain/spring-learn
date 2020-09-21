/*
 * iaskbear
 * Created on 2020-09-10
 */
package com.idlebear.springlearn.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author iaskbear <a href="mailto:iaskbear@google.com">iaskbear</a>
 * @version $Id$
 */
public class PersonBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("invoke bean post before intialization, beanName : " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("invoke bean post after initialization, beanName : " + beanName);
        return bean;
    }
}
