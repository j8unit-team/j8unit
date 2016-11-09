package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.Callable;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Callable} (by simply reusing the
 * J8Unit test interface {@link CallableTests}).
 */

@RunWith(J8Unit4.class)
public class CallableTest<V>
implements CallableTests<Callable<V>, V> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.Callable]

    @Override
    public Callable<V> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.concurrent.Callable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.Callable]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.Callable]

}
