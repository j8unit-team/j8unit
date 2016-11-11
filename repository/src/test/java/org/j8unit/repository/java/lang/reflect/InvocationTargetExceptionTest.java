package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.InvocationTargetException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link InvocationTargetException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.lang.reflect.InvocationTargetExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class InvocationTargetExceptionTest
implements InvocationTargetExceptionTests<InvocationTargetException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.reflect.InvocationTargetException]

    @Override
    public InvocationTargetException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.reflect.InvocationTargetException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.reflect.InvocationTargetException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.reflect.InvocationTargetException]

}
