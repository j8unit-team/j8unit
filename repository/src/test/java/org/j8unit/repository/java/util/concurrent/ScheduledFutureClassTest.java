package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.ScheduledFuture;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ScheduledFuture} (by simply reusing the
 * J8Unit test interface {@link ScheduledFutureClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ScheduledFutureClassTest
implements ScheduledFutureClassTests<ScheduledFuture> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.ScheduledFuture]

    @Override
    public Class<ScheduledFuture> createNewSUT() {
        return ScheduledFuture.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.ScheduledFuture]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.ScheduledFuture]

}
