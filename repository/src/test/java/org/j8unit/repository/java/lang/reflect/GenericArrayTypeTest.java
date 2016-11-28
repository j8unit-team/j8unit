package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.GenericArrayType;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link GenericArrayType} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.lang.reflect.GenericArrayTypeTests}).
 */
@RunWith(J8Unit4.class)
public class GenericArrayTypeTest
implements GenericArrayTypeTests<GenericArrayType> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.reflect.GenericArrayType]

    @Override
    public GenericArrayType createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.lang.reflect.GenericArrayType], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.reflect.GenericArrayType]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.reflect.GenericArrayType]

}
