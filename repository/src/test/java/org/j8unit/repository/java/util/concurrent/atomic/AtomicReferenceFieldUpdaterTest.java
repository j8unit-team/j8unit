package org.j8unit.repository.java.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AtomicReferenceFieldUpdater} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.util.concurrent.atomic.AtomicReferenceFieldUpdaterTests}).
 */
@RunWith(J8Unit4.class)
public class AtomicReferenceFieldUpdaterTest<T, V>
implements AtomicReferenceFieldUpdaterTests<AtomicReferenceFieldUpdater<T, V>, T, V> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.atomic.AtomicReferenceFieldUpdater]

    @Override
    public AtomicReferenceFieldUpdater<T, V> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.concurrent.atomic.AtomicReferenceFieldUpdater], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.atomic.AtomicReferenceFieldUpdater]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.atomic.AtomicReferenceFieldUpdater]

}
