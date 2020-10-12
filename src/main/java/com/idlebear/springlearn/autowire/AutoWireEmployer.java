/*
 * iaskbear
 * Created on 2020-09-21
 */
package com.idlebear.springlearn.autowire;

/**
 * @author iaskbear <a href="mailto:iaskbear@google.com">iaskbear</a>
 * @version $Id$
 */
public class AutoWireEmployer {
    private AutoWireEmployee autoWireEmployee;

    public void setAutoWireEmployee(AutoWireEmployee autoWireEmployee) {
        this.autoWireEmployee = autoWireEmployee;
    }

    public AutoWireEmployee getAutoWireEmployee() {
        return autoWireEmployee;
    }
}