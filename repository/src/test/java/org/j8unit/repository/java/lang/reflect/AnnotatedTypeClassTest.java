package org.j8unit.repository.java.lang.reflect;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AnnotatedTypeClassTest
implements org.j8unit.repository.java.lang.reflect.AnnotatedTypeClassTests<java.lang.reflect.AnnotatedType> {

    @Override
    public Class<java.lang.reflect.AnnotatedType> createNewSUT() {
        return java.lang.reflect.AnnotatedType.class;
    }

}
