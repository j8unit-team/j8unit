package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ScheduledThreadPoolExecutorTest
implements org.j8unit.repository.java.util.concurrent.ScheduledThreadPoolExecutorTests<java.util.concurrent.ScheduledThreadPoolExecutor> {

    @Override
    public java.util.concurrent.ScheduledThreadPoolExecutor createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.util.concurrent.ScheduledThreadPoolExecutor] available.");
    }

}
