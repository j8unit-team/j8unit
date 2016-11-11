package org.j8unit.repository.java.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AtomicIntegerFieldUpdater} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.util.concurrent.atomic.AtomicIntegerFieldUpdaterTests}).
 */

@RunWith(J8Unit4.class)
public class AtomicIntegerFieldUpdaterTest<T>
implements AtomicIntegerFieldUpdaterTests<AtomicIntegerFieldUpdater<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.atomic.AtomicIntegerFieldUpdater]

    @Override
    public AtomicIntegerFieldUpdater<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.concurrent.atomic.AtomicIntegerFieldUpdater], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.atomic.AtomicIntegerFieldUpdater]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.atomic.AtomicIntegerFieldUpdater]

}
