/*
 * chsi
 * Created on 2020-10-15
 */
package com.idlebear.springlearn.aop.biancheng;

/**
 * @author @author iaskbear <a href="mailto:iaskbear@google.com">iaskbear</a>
 * @version $Id$
 */
public class TargetService1 implements Service1 {
    @Override
    public void service1() {
        System.out.println("Yout Know, I am the targetService1 implements Service1");
    }
}