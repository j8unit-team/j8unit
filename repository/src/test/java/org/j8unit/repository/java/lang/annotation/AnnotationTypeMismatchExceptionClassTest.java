package org.j8unit.repository.java.lang.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AnnotationTypeMismatchExceptionClassTest
implements org.j8unit.repository.java.lang.annotation.AnnotationTypeMismatchExceptionClassTests<java.lang.annotation.AnnotationTypeMismatchException> {

    @Override
    public Class<java.lang.annotation.AnnotationTypeMismatchException> createNewSUT() {
        return java.lang.annotation.AnnotationTypeMismatchException.class;
    }

}
