package org.j8unit.repository.java.lang.annotation;

import java.lang.annotation.AnnotationTypeMismatchException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AnnotationTypeMismatchExceptionTest
implements org.j8unit.repository.java.lang.annotation.AnnotationTypeMismatchExceptionTests<AnnotationTypeMismatchException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.annotation.AnnotationTypeMismatchException]

    @Override
    public AnnotationTypeMismatchException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.annotation.AnnotationTypeMismatchException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.annotation.AnnotationTypeMismatchException]

}
