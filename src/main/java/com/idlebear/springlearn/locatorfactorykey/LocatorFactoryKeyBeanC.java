/*
 * chsi
 * Created on 2020-11-03
 */
package com.idlebear.springlearn.locatorfactorykey;

/**
 * @author iaskbear <a href="mailto:iaskbear@google.com">iaskbear</a>
 * @version $Id$
 */
public class LocatorFactoryKeyBeanC {
    private LocatorFactoryKeyBeanA beanA;
    private LocatorFactoryKeyBeanB beanB;

    public LocatorFactoryKeyBeanA getBeanA() {
        return beanA;
    }

    public void setBeanA(LocatorFactoryKeyBeanA beanA) {
        this.beanA = beanA;
    }

    public LocatorFactoryKeyBeanB getBeanB() {
        return beanB;
    }

    public void setBeanB(LocatorFactoryKeyBeanB beanB) {
        this.beanB = beanB;
    }
}