package org.j8unit.repository.java.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AtomicLongFieldUpdater} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.util.concurrent.atomic.AtomicLongFieldUpdaterTests}).
 */
@RunWith(J8Unit4.class)
public class AtomicLongFieldUpdaterTest<T>
implements AtomicLongFieldUpdaterTests<AtomicLongFieldUpdater<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.atomic.AtomicLongFieldUpdater]

    @Override
    public AtomicLongFieldUpdater<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.concurrent.atomic.AtomicLongFieldUpdater], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.atomic.AtomicLongFieldUpdater]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.atomic.AtomicLongFieldUpdater]

}
