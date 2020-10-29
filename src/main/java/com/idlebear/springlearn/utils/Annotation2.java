/*
 * chsi
 * Created on 2020-10-27
 */
package com.idlebear.springlearn.utils;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author iaskbear <a href="mailto:iaskbear@google.com">iaskbear</a>
 * @version $Id$
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Annotation2 {
    String id();
}