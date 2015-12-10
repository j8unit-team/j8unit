package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ScheduledExecutorServiceClassTest
implements org.j8unit.repository.java.util.concurrent.ScheduledExecutorServiceClassTests<java.util.concurrent.ScheduledExecutorService> {

    @Override
    public Class<java.util.concurrent.ScheduledExecutorService> createNewSUT() {
        return java.util.concurrent.ScheduledExecutorService.class;
    }

}
