package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.FutureTask;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link FutureTask} (by simply reusing the
 * J8Unit test interface {@link FutureTaskTests}).
 */

@RunWith(J8Unit4.class)
public class FutureTaskTest<V>
implements FutureTaskTests<FutureTask<V>, V> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.FutureTask]

    @Override
    public FutureTask<V> createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.concurrent.FutureTask], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.FutureTask]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.FutureTask]

}
