/*
 * chsi
 * Created on 2020-12-09
 */
package com.idlebear.springlearn.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author iaskbear <a href="mailto:iaskbear@google.com">iaskbear</a>
 * @version $Id$
 */
public class TestBean {
    @Value("${test.username}")
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}