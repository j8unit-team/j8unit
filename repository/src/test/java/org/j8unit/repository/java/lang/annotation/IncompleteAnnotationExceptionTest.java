package org.j8unit.repository.java.lang.annotation;

import java.lang.annotation.IncompleteAnnotationException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IncompleteAnnotationExceptionTest
implements org.j8unit.repository.java.lang.annotation.IncompleteAnnotationExceptionTests<IncompleteAnnotationException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.annotation.IncompleteAnnotationException]

    @Override
    public IncompleteAnnotationException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.annotation.IncompleteAnnotationException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.annotation.IncompleteAnnotationException]

}
