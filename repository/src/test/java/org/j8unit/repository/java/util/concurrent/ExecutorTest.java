package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.Executor;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Executor} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.concurrent.ExecutorTests}).
 */

@RunWith(J8Unit4.class)
public class ExecutorTest
implements ExecutorTests<Executor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.Executor]

    @Override
    public Executor createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.concurrent.Executor], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.Executor]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.Executor]

}
