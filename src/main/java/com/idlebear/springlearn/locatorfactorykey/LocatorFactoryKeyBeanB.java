/*
 * chsi
 * Created on 2020-11-03
 */
package com.idlebear.springlearn.locatorfactorykey;

/**
 * @author iaskbear <a href="mailto:iaskbear@google.com">iaskbear</a>
 * @version $Id$
 */
public class LocatorFactoryKeyBeanB {
    private LocatorFactoryKeyBeanA beanA;
    private String alias;

    public LocatorFactoryKeyBeanA getBeanA() {
        return beanA;
    }

    public void setBeanA(LocatorFactoryKeyBeanA beanA) {
        this.beanA = beanA;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}