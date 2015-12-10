package org.j8unit.repository.java.lang.reflect;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AnnotatedWildcardTypeClassTest
implements org.j8unit.repository.java.lang.reflect.AnnotatedWildcardTypeClassTests<java.lang.reflect.AnnotatedWildcardType> {

    @Override
    public Class<java.lang.reflect.AnnotatedWildcardType> createNewSUT() {
        return java.lang.reflect.AnnotatedWildcardType.class;
    }

}
