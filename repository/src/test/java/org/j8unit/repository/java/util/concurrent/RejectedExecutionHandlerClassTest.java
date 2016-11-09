package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.RejectedExecutionHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RejectedExecutionHandler} (by simply
 * reusing the J8Unit test interface {@link RejectedExecutionHandlerClassTests}).
 */

@RunWith(J8Unit4.class)
public class RejectedExecutionHandlerClassTest
implements RejectedExecutionHandlerClassTests<RejectedExecutionHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.RejectedExecutionHandler]

    @Override
    public Class<RejectedExecutionHandler> createNewSUT() {
        return RejectedExecutionHandler.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.RejectedExecutionHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.RejectedExecutionHandler]

}
