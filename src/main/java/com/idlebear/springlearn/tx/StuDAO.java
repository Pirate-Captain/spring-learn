/*
 * chsi
 * Created on 2020-10-12
 */
package com.idlebear.springlearn.tx;

/**
 * @author iaskbear <a href="mailto:iaskbear@google.com">iaskbear</a>
 * @version $Id$
 */
public interface StuDAO {
    void save(Student student);

    void queryAll();
}