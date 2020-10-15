/*
 * chsi
 * Created on 2020-10-13
 */
package com.idlebear.springlearn.tx;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author iaskbear <a href="mailto:iaskbear@google.com">iaskbear</a>
 * @version $Id$
 */
public class StuJdbcAnnotationDAOImpl implements StuDAO {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Transactional
    @Override
    public void save(Student student) {
        String sql = "insert into student(name, age) values(?,?)";
        jdbcTemplate.update(sql, student.getName(), student.getAge());
    }

    @Transactional
    @Override
    public void queryAll() {
        String sql = "select * from student";
        jdbcTemplate.query(sql, rs -> {
            System.out.println(rs.getString("name") + "\t" + rs.getInt("age"));
        });
    }
}
