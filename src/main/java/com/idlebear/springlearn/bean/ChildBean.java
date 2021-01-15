/*
 * chsi
 * Created on 2020-12-10
 */
package com.idlebear.springlearn.bean;

/**
 * @author iaskbear <a href="mailto:iaskbear@google.com">iaskbear</a>
 * @version $Id$
 */
public class ChildBean extends ParentBean {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}