package org.j8unit.repository.java.lang.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IncompleteAnnotationExceptionTest
implements org.j8unit.repository.java.lang.annotation.IncompleteAnnotationExceptionTests<java.lang.annotation.IncompleteAnnotationException> {

    @Override
    public java.lang.annotation.IncompleteAnnotationException createNewSUT() {
        throw new AssertionError("There is no default constructor for [java.lang.annotation.IncompleteAnnotationException] available.");
    }

}
