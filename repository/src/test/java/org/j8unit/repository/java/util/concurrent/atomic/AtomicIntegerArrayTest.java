package org.j8unit.repository.java.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicIntegerArray;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AtomicIntegerArrayTest
implements org.j8unit.repository.java.util.concurrent.atomic.AtomicIntegerArrayTests<AtomicIntegerArray> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.atomic.AtomicIntegerArray]

    @Override
    public AtomicIntegerArray createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.concurrent.atomic.AtomicIntegerArray], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.atomic.AtomicIntegerArray]

}
