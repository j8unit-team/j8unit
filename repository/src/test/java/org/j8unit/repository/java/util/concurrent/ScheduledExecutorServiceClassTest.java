package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.ScheduledExecutorService;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ScheduledExecutorService} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.util.concurrent.ScheduledExecutorServiceClassTests}).
 */

@RunWith(J8Unit4.class)
public class ScheduledExecutorServiceClassTest
implements ScheduledExecutorServiceClassTests<ScheduledExecutorService> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.ScheduledExecutorService]

    @Override
    public Class<ScheduledExecutorService> createNewSUT() {
        return ScheduledExecutorService.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.ScheduledExecutorService]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.ScheduledExecutorService]

}
