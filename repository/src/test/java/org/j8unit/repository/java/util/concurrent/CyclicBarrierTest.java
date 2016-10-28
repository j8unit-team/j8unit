package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.CyclicBarrier;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CyclicBarrierTest
implements org.j8unit.repository.java.util.concurrent.CyclicBarrierTests<CyclicBarrier> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.CyclicBarrier]

    @Override
    public CyclicBarrier createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.concurrent.CyclicBarrier], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.CyclicBarrier]

}
