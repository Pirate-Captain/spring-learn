/*
 * chsi
 * Created on 2020-12-10
 */
package com.idlebear.springlearn.bean;

/**
 * @author iaskbear <a href="mailto:iaskbear@google.com">iaskbear</a>
 * @version $Id$
 */
public abstract class ParentBean {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}