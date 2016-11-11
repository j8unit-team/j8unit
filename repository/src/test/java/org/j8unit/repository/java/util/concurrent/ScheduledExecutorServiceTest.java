package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.ScheduledExecutorService;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ScheduledExecutorService} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.util.concurrent.ScheduledExecutorServiceTests}).
 */

@RunWith(J8Unit4.class)
public class ScheduledExecutorServiceTest
implements ScheduledExecutorServiceTests<ScheduledExecutorService> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.ScheduledExecutorService]

    @Override
    public ScheduledExecutorService createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.concurrent.ScheduledExecutorService], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.ScheduledExecutorService]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.ScheduledExecutorService]

}
