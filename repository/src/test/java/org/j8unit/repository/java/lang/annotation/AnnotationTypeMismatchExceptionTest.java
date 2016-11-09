package org.j8unit.repository.java.lang.annotation;

import java.lang.annotation.AnnotationTypeMismatchException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AnnotationTypeMismatchException} (by
 * simply reusing the J8Unit test interface {@link AnnotationTypeMismatchExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class AnnotationTypeMismatchExceptionTest
implements AnnotationTypeMismatchExceptionTests<AnnotationTypeMismatchException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.annotation.AnnotationTypeMismatchException]

    @Override
    public AnnotationTypeMismatchException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.annotation.AnnotationTypeMismatchException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.annotation.AnnotationTypeMismatchException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.annotation.AnnotationTypeMismatchException]

}
