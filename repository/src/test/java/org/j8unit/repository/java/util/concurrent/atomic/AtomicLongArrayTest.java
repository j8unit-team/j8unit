package org.j8unit.repository.java.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicLongArray;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AtomicLongArrayTest
implements org.j8unit.repository.java.util.concurrent.atomic.AtomicLongArrayTests<AtomicLongArray> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.atomic.AtomicLongArray]

    @Override
    public AtomicLongArray createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.concurrent.atomic.AtomicLongArray], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.atomic.AtomicLongArray]

}
