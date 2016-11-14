package org.j8unit.repository.java.util.concurrent.locks;

import java.util.concurrent.locks.LockSupport;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link LockSupport} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.concurrent.locks.LockSupportTests}).
 */

@RunWith(J8Unit4.class)
public class LockSupportTest
implements LockSupportTests<LockSupport> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.locks.LockSupport]

    @Override
    public LockSupport createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.concurrent.locks.LockSupport], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.locks.LockSupport]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.locks.LockSupport]

}
