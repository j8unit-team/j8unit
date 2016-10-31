package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.AnnotatedTypeVariable;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AnnotatedTypeVariableTest
implements org.j8unit.repository.java.lang.reflect.AnnotatedTypeVariableTests<AnnotatedTypeVariable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.reflect.AnnotatedTypeVariable]

    @Override
    public AnnotatedTypeVariable createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.lang.reflect.AnnotatedTypeVariable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.reflect.AnnotatedTypeVariable]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.reflect.AnnotatedTypeVariable]

}
