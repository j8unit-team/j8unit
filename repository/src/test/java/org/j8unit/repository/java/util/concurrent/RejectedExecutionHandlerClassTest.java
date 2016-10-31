package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.RejectedExecutionHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RejectedExecutionHandlerClassTest
implements org.j8unit.repository.java.util.concurrent.RejectedExecutionHandlerClassTests<RejectedExecutionHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.RejectedExecutionHandler]

    @Override
    public Class<RejectedExecutionHandler> createNewSUT() {
        return RejectedExecutionHandler.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.RejectedExecutionHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.RejectedExecutionHandler]

}
