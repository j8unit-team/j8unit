package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.RejectedExecutionHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RejectedExecutionHandlerTest
implements org.j8unit.repository.java.util.concurrent.RejectedExecutionHandlerTests<RejectedExecutionHandler> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.RejectedExecutionHandler]

    @Override
    public RejectedExecutionHandler createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.concurrent.RejectedExecutionHandler], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.RejectedExecutionHandler]

}
