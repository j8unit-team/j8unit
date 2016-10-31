package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.AnnotatedWildcardType;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AnnotatedWildcardTypeTest
implements org.j8unit.repository.java.lang.reflect.AnnotatedWildcardTypeTests<AnnotatedWildcardType> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.reflect.AnnotatedWildcardType]

    @Override
    public AnnotatedWildcardType createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.lang.reflect.AnnotatedWildcardType], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.reflect.AnnotatedWildcardType]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.reflect.AnnotatedWildcardType]

}
