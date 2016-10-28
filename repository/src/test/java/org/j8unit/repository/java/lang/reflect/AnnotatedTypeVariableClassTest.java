package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.AnnotatedTypeVariable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AnnotatedTypeVariableClassTest
implements org.j8unit.repository.java.lang.reflect.AnnotatedTypeVariableClassTests<AnnotatedTypeVariable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.reflect.AnnotatedTypeVariable]

    @Override
    public Class<AnnotatedTypeVariable> createNewSUT() {
        return AnnotatedTypeVariable.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.reflect.AnnotatedTypeVariable]

}
