/*
 * chsi
 * Created on 2020-10-12
 */
package com.idlebear.springlearn.tx;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.sql.DataSource;

/**
 * 编程式事务管理
 *
 * @author iaskbear <a href="mailto:iaskbear@google.com">iaskbear</a>
 * @version $Id$
 */
public class StuJdbcTemplateTest {
    private static StuDAO stuDAO;
    private static JdbcTemplate jdbcTemplate;
    private static PlatformTransactionManager transactionManager;

    @BeforeClass
    public static void createTable() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("tx/tx-beans.xml");
        stuDAO = (StuDAO) context.getBean("stuJdbcTemplateDAO");
        jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
        DataSource dataSource = (DataSource) context.getBean("dataSource");
        transactionManager = new DataSourceTransactionManager(dataSource);

        jdbcTemplate.execute("create table student(name varchar2(32) not null, age number(3))");
    }

    @Test
    public void testSaveStuWithNoTransaction() {
        Student student = new Student();
        student.setName("张三");
        student.setAge("20");
        stuDAO.save(student);
    }

    @Test
    public void testSaveStuWithTransaction() {
        Student student = new Student();
        student.setName("张三");
        student.setAge("20");

        DefaultTransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
        TransactionStatus transactionStatus = transactionManager.getTransaction(transactionDefinition);
        stuDAO.save(student);
        transactionManager.commit(transactionStatus);
    }

    @Test
    public void testMultiTransaction() {
        Student student = new Student();
        student.setName("张三");
        student.setAge("20");

        DefaultTransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
        TransactionStatus transactionStatus = transactionManager.getTransaction(transactionDefinition);
        stuDAO.save(student);

        stuDAO.queryAll();

        DefaultTransactionDefinition transactionDefinition1 = new DefaultTransactionDefinition();
        transactionDefinition1.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
        TransactionStatus transactionStatus1 = transactionManager.getTransaction(transactionDefinition1);

        Student student1 = new Student();
        student1.setName("李四");
        student1.setAge("30");
        stuDAO.save(student1);

        stuDAO.queryAll();
        transactionManager.commit(transactionStatus1);

        // 事务的隔离级别不同，rollback的也不同
        transactionManager.rollback(transactionStatus);

        stuDAO.queryAll();
    }

    @AfterClass
    public static void dropTable() {
        jdbcTemplate.execute("drop table student");
    }
}