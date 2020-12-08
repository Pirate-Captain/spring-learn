/*
 * chsi
 * Created on 2020-12-08
 */
package com.idlebear.springlearn.controller;

import com.idlebear.springlearn.locatorfactorykey.LocatorFactoryKeyBeanA;
import com.idlebear.springlearn.locatorfactorykey.LocatorFactoryKeyBeanC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author iaskbear <a href="mailto:iaskbear@google.com">iaskbear</a>
 * @version $Id$
 */
@Controller
@RequestMapping("/resource")
public class ServletContextResourceController {
//    @Autowired
//    private LocatorFactoryKeyBeanA beanA;
    @Autowired
    private LocatorFactoryKeyBeanC beanC;

    @ResponseBody
    @RequestMapping("path")
    public String getResource(String path) throws IOException {
        WebApplicationContext webApplicationContext = ContextLoader.getCurrentWebApplicationContext();
        ServletContext servletContext = webApplicationContext.getServletContext();

        InputStream inputStream = servletContext.getResourceAsStream(path);
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        StringBuilder resultBuffer = new StringBuilder();
        while ( (line = br.readLine()) != null ) {
            resultBuffer.append(line);
        }
        return resultBuffer.toString();
    }
}