package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.FutureTask;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FutureTaskTest<V>
implements org.j8unit.repository.java.util.concurrent.FutureTaskTests<FutureTask<V>, V> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.FutureTask]

    @Override
    public FutureTask<V> createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.concurrent.FutureTask], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.FutureTask]

}
