/*
 * chsi
 * Created on 2020-10-27
 */
package com.idlebear.springlearn.utils;

import org.springframework.beans.annotation.AnnotationBeanUtils;

/**
 * @author iaskbear <a href="mailto:iaskbear@google.com">iaskbear</a>
 * @version $Id$
 */
public class AnnotationBeanUtilsTest {
    public static void main(String[] args) throws NoSuchFieldException {
        Annotation1 annotation1 = AnnotationInfo.class.getAnnotation(Annotation1.class);
        AnnotationInfo annotationInfo = new AnnotationInfo();
        AnnotationBeanUtils.copyPropertiesToBean(annotation1, annotationInfo);
        System.out.println(annotationInfo.getName());

        Annotation2 annotation2 = AnnotationInfo.class.getDeclaredField("id").getAnnotation(Annotation2.class);
        AnnotationBeanUtils.copyPropertiesToBean(annotation2, annotationInfo);
        System.out.println(annotationInfo.getId());
    }
}