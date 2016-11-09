package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.RunnableScheduledFuture;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RunnableScheduledFuture} (by simply
 * reusing the J8Unit test interface {@link RunnableScheduledFutureClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class RunnableScheduledFutureClassTest
implements RunnableScheduledFutureClassTests<RunnableScheduledFuture> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.RunnableScheduledFuture]

    @Override
    public Class<RunnableScheduledFuture> createNewSUT() {
        return RunnableScheduledFuture.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.RunnableScheduledFuture]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.RunnableScheduledFuture]

}
