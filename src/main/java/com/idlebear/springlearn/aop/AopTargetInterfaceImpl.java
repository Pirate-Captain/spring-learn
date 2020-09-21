/*
 * iaskbear
 * Created on 2020-09-17
 */
package com.idlebear.springlearn.aop;

/**
 * @author iaskbear <a href="mailto:iaskbear@google.com">iaskbear</a>
 * @version $Id$
 */
public class AopTargetInterfaceImpl implements AopTargetInterface {

    @Override
    public void add() {
        System.out.println("invoke add");
    }

    @Override
    public void delete() {
        System.out.println("invoke delete");
    }

    @Override
    public void update() {
        System.out.println("invoke update");
    }

    @Override
    public void query() {
        System.out.println("invoke query");
    }
}