package org.j8unit.repository.java.lang.invoke;

import java.lang.invoke.MethodHandleProxies;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MethodHandleProxies} (by simply
 * reusing the J8Unit test interface {@link MethodHandleProxiesTests}).
 */

@RunWith(J8Unit4.class)
public class MethodHandleProxiesTest
implements MethodHandleProxiesTests<MethodHandleProxies> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.invoke.MethodHandleProxies]

    @Override
    public MethodHandleProxies createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.invoke.MethodHandleProxies], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.invoke.MethodHandleProxies]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.invoke.MethodHandleProxies]

}
