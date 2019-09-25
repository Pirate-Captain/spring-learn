/*
 * chsi
 * Created on 2019-09-25
 */
package com.idlebear.springlearn.factorybean;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author iaskbear <a href="mailto:iaskbear@google.com">iaskbear</a>
 * @version $Id$
 */
public class SchoolFactoryBean implements FactoryBean<School> {
    private String schoolInfo;

    @Override
    public School getObject() throws Exception {
        School school = new School();
        if ( StringUtils.isBlank(schoolInfo) ) {
            return school;
        }
        String[] schoolInfoArr = StringUtils.split(schoolInfo, ",");
        school.setName(schoolInfoArr[0]);
        school.setAddress(schoolInfoArr[1]);
        return school;
    }

    @Override
    public Class<?> getObjectType() {
        return School.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    public void setSchoolInfo(String schoolInfo) {
        this.schoolInfo = schoolInfo;
    }
}
