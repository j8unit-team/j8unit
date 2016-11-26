package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.Method;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Method} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.lang.reflect.MethodTests}).
 */
@RunWith(J8Unit4.class)
public class MethodTest
implements MethodTests<Method> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.reflect.Method]

    @Override
    public Method createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.reflect.Method], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.reflect.Method]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.reflect.Method]

}
