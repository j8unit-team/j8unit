package org.j8unit.repository.java.util.concurrent.locks;

import java.util.concurrent.locks.AbstractQueuedLongSynchronizer;
import java.util.concurrent.locks.AbstractQueuedLongSynchronizer.ConditionObject;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AbstractQueuedLongSynchronizer} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.util.concurrent.locks.AbstractQueuedLongSynchronizerTests}).
 */
@RunWith(J8Unit4.class)
public class AbstractQueuedLongSynchronizerTest
implements AbstractQueuedLongSynchronizerTests<AbstractQueuedLongSynchronizer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.locks.AbstractQueuedLongSynchronizer]

    @Override
    public AbstractQueuedLongSynchronizer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.concurrent.locks.AbstractQueuedLongSynchronizer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.locks.AbstractQueuedLongSynchronizer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.locks.AbstractQueuedLongSynchronizer]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link ConditionObject} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.java.util.concurrent.locks.AbstractQueuedLongSynchronizerTests.ConditionObjectTests}).
     */
    @RunWith(J8Unit4.class)
    public static class ConditionObjectTest
    implements ConditionObjectTests<ConditionObject> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.locks.AbstractQueuedLongSynchronizer$ConditionObject]

        @Override
        public ConditionObject createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.concurrent.locks.AbstractQueuedLongSynchronizer.ConditionObject], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.locks.AbstractQueuedLongSynchronizer$ConditionObject]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.locks.AbstractQueuedLongSynchronizer$ConditionObject]

    }

}
