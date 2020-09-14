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
public class PersonalAddressBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    private String province;
    private String DetailAddress;

    public PersonalAddressBean() {
        System.out.println("invoke address constructor");
    }

    public void setProvince(String province) {
        this.province = province;
        System.out.println("invoke setProvince : " + province);
    }

    public void setDetailAddress(String detailAddress) {
        DetailAddress = detailAddress;
        System.out.println("invoke detailAddress : " + detailAddress);
    }

    public void myInit() {
        System.out.println("invoke personalAddress my init");
    }

    public void myDestroy() {
        System.out.println("invoke personalAddress my destory");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("invoke personalAddress setBeanFactory");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("invoke personalAddress setBeanName");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("invoke personalAddress destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("invoke personalAddress afterPropertiesSet");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("invoke personalAddress setApplicationContext");
    }
}