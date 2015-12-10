package org.j8unit.repository.java.lang.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IncompleteAnnotationExceptionClassTest
implements org.j8unit.repository.java.lang.annotation.IncompleteAnnotationExceptionClassTests<java.lang.annotation.IncompleteAnnotationException> {

    @Override
    public Class<java.lang.annotation.IncompleteAnnotationException> createNewSUT() {
        return java.lang.annotation.IncompleteAnnotationException.class;
    }

}
