package org.j8unit.repository.java.lang.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AnnotationClassTest
implements org.j8unit.repository.java.lang.annotation.AnnotationClassTests<java.lang.annotation.Annotation> {

    @Override
    public Class<java.lang.annotation.Annotation> createNewSUT() {
        return java.lang.annotation.Annotation.class;
    }

}
