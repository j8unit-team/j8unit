package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.ThreadFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ThreadFactory} (by simply reusing the
 * J8Unit test interface {@link ThreadFactoryTests}).
 */

@RunWith(J8Unit4.class)
public class ThreadFactoryTest
implements ThreadFactoryTests<ThreadFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.ThreadFactory]

    @Override
    public ThreadFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.concurrent.ThreadFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.ThreadFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.ThreadFactory]

}
