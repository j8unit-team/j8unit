package org.j8unit.repository.java.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicIntegerArray;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AtomicIntegerArray} (by simply
 * reusing the J8Unit test interface {@link AtomicIntegerArrayTests}).
 */

@RunWith(J8Unit4.class)
public class AtomicIntegerArrayTest
implements AtomicIntegerArrayTests<AtomicIntegerArray> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.atomic.AtomicIntegerArray]

    @Override
    public AtomicIntegerArray createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.concurrent.atomic.AtomicIntegerArray], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.atomic.AtomicIntegerArray]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.atomic.AtomicIntegerArray]

}
