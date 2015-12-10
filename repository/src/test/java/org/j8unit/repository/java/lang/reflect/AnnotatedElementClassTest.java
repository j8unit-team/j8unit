package org.j8unit.repository.java.lang.reflect;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AnnotatedElementClassTest
implements org.j8unit.repository.java.lang.reflect.AnnotatedElementClassTests<java.lang.reflect.AnnotatedElement> {

    @Override
    public Class<java.lang.reflect.AnnotatedElement> createNewSUT() {
        return java.lang.reflect.AnnotatedElement.class;
    }

}
