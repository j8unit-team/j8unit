package org.j8unit.repository.java.util.concurrent.locks;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.AbstractQueuedSynchronizer.ConditionObject;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AbstractQueuedSynchronizerTest
implements org.j8unit.repository.java.util.concurrent.locks.AbstractQueuedSynchronizerTests<AbstractQueuedSynchronizer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.locks.AbstractQueuedSynchronizer]

    @Override
    public AbstractQueuedSynchronizer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.concurrent.locks.AbstractQueuedSynchronizer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.locks.AbstractQueuedSynchronizer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.locks.AbstractQueuedSynchronizer]

    @RunWith(J8Unit4.class)
    public static class ConditionObjectTest
    implements org.j8unit.repository.java.util.concurrent.locks.AbstractQueuedSynchronizerTests.ConditionObjectTests<ConditionObject> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject]

        @Override
        public ConditionObject createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.concurrent.locks.AbstractQueuedSynchronizer.ConditionObject], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject]

    }

}
