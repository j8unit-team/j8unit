package org.j8unit.repository.java.lang.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AnnotationFormatErrorTest
implements org.j8unit.repository.java.lang.annotation.AnnotationFormatErrorTests<java.lang.annotation.AnnotationFormatError> {

    @Override
    public java.lang.annotation.AnnotationFormatError createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.lang.annotation.AnnotationFormatError] available.");
    }

}
