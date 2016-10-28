package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.ForkJoinWorkerThread;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ForkJoinWorkerThreadTest
implements org.j8unit.repository.java.util.concurrent.ForkJoinWorkerThreadTests<ForkJoinWorkerThread> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.ForkJoinWorkerThread]

    @Override
    public ForkJoinWorkerThread createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.concurrent.ForkJoinWorkerThread], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.ForkJoinWorkerThread]

}
