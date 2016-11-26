package org.j8unit.repository.java.util.concurrent.locks;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AbstractOwnableSynchronizer} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.util.concurrent.locks.AbstractOwnableSynchronizerTests}).
 */
@RunWith(J8Unit4.class)
public class AbstractOwnableSynchronizerTest
implements AbstractOwnableSynchronizerTests<AbstractOwnableSynchronizer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.locks.AbstractOwnableSynchronizer]

    @Override
    public AbstractOwnableSynchronizer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.concurrent.locks.AbstractOwnableSynchronizer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.locks.AbstractOwnableSynchronizer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.locks.AbstractOwnableSynchronizer]

}
