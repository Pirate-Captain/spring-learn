/*
 * iaskbear
 * Created on 2020-09-17
 */
package com.idlebear.springlearn.aop;

/**
 * @author iaskbear <a href="mailto:iaskbear@google.com">iaskbear</a>
 * @version $Id$
 */
public interface AopTargetInterface {
    void add();
    void delete();
    void update();
    void query();
}