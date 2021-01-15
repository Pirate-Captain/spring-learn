/*
 * chsi
 * Created on 2020-12-09
 */
package com.idlebear.springlearn.controller;

import com.idlebear.springlearn.bean.TestBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author iaskbear <a href="mailto:iaskbear@google.com">iaskbear</a>
 * @version $Id$
 */
@Configuration
@PropertySource(value = "classpath:propertysource/test.properties")
public class SpringLearnConfig {
    @Value("${test.username}")
    private String userName;

    @Bean
    public TestBean testBean() {
        return new TestBean();
    }
}