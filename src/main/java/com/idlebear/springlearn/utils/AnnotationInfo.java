/*
 * chsi
 * Created on 2020-10-27
 */
package com.idlebear.springlearn.utils;

/**
 * @author iaskbear <a href="mailto:iaskbear@google.com">iaskbear</a>
 * @version $Id$
 */
@Annotation1(name = "张三", age = 20)
public class AnnotationInfo {
    @Annotation2(id = "dfaidfoadfasdf")
    private String id;
    private String name;
    private int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}