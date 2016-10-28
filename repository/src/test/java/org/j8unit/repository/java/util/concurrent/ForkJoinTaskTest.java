package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.ForkJoinTask;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ForkJoinTaskTest<V>
implements org.j8unit.repository.java.util.concurrent.ForkJoinTaskTests<ForkJoinTask<V>, V> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.ForkJoinTask]

    @Override
    public ForkJoinTask<V> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.concurrent.ForkJoinTask], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.ForkJoinTask]

}
