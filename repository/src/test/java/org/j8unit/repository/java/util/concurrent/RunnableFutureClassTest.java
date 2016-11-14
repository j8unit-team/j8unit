package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.RunnableFuture;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RunnableFuture} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.concurrent.RunnableFutureClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class RunnableFutureClassTest
implements RunnableFutureClassTests<RunnableFuture> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.RunnableFuture]

    @Override
    public Class<RunnableFuture> createNewSUT() {
        return RunnableFuture.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.RunnableFuture]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.RunnableFuture]

}
