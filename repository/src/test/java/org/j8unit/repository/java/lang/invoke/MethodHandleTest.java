package org.j8unit.repository.java.lang.invoke;

import java.lang.invoke.MethodHandle;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MethodHandle} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.lang.invoke.MethodHandleTests}).
 */
@RunWith(J8Unit4.class)
public class MethodHandleTest
implements MethodHandleTests<MethodHandle> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.invoke.MethodHandle]

    @Override
    public MethodHandle createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.lang.invoke.MethodHandle], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.invoke.MethodHandle]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.invoke.MethodHandle]

}
