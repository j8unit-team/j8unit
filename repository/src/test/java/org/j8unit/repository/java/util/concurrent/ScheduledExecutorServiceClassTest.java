package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.ScheduledExecutorService;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ScheduledExecutorServiceClassTest
implements org.j8unit.repository.java.util.concurrent.ScheduledExecutorServiceClassTests<ScheduledExecutorService> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.ScheduledExecutorService]

    @Override
    public Class<ScheduledExecutorService> createNewSUT() {
        return ScheduledExecutorService.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.ScheduledExecutorService]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.ScheduledExecutorService]

}
