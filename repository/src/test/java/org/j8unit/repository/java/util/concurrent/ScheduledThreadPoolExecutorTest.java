package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ScheduledThreadPoolExecutorTest
implements org.j8unit.repository.java.util.concurrent.ScheduledThreadPoolExecutorTests<ScheduledThreadPoolExecutor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.ScheduledThreadPoolExecutor]

    @Override
    public ScheduledThreadPoolExecutor createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.concurrent.ScheduledThreadPoolExecutor], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.ScheduledThreadPoolExecutor]

}
