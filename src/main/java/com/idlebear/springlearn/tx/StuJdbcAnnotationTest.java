/*
 * chsi
 * Created on 2020-10-13
 */
package com.idlebear.springlearn.tx;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author iaskbear <a href="mailto:iaskbear@google.com">iaskbear</a>
 * @version $Id$
 */
public class StuJdbcAnnotationTest {
    private static StuDAO stuDAO;
    private static JdbcTemplate jdbcTemplate;

    @BeforeClass
    public static void createTable() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("tx/tx-annotation.xml");
        stuDAO = (StuDAO) context.getBean("stuJdbcTemplateDAO");
        jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");

        jdbcTemplate.execute("create table student(name varchar2(32) not null, age number(3))");
    }

    @Test
    public void test() {
        Student student = new Student();
        student.setName("张三");
        student.setAge("20");
        stuDAO.save(student);

        stuDAO.queryAll();
    }

    @AfterClass
    public static void dropTable() {
        jdbcTemplate.execute("drop table student");
    }
}