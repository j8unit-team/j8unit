package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.RunnableFuture;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RunnableFuture} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.util.concurrent.RunnableFutureTests}).
 */
@RunWith(J8Unit4.class)
public class RunnableFutureTest<V>
implements RunnableFutureTests<RunnableFuture<V>, V> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.RunnableFuture]

    @Override
    public RunnableFuture<V> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.concurrent.RunnableFuture], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.RunnableFuture]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.RunnableFuture]

}
