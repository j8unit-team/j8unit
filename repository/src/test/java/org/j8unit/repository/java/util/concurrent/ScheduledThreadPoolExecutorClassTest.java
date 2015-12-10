package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ScheduledThreadPoolExecutorClassTest
implements org.j8unit.repository.java.util.concurrent.ScheduledThreadPoolExecutorClassTests<java.util.concurrent.ScheduledThreadPoolExecutor> {

    @Override
    public Class<java.util.concurrent.ScheduledThreadPoolExecutor> createNewSUT() {
        return java.util.concurrent.ScheduledThreadPoolExecutor.class;
    }

}
