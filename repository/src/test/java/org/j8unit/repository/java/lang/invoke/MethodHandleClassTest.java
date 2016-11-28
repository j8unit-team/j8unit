package org.j8unit.repository.java.lang.invoke;

import java.lang.invoke.MethodHandle;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MethodHandle} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.lang.invoke.MethodHandleClassTests}).
 */
@RunWith(J8Unit4.class)
public class MethodHandleClassTest
implements MethodHandleClassTests<MethodHandle> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.invoke.MethodHandle]

    @Override
    public Class<MethodHandle> createNewSUT() {
        return MethodHandle.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.invoke.MethodHandle]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.invoke.MethodHandle]

}
