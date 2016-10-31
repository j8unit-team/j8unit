package org.j8unit.repository.java.util.logging;

import java.util.logging.Handler;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HandlerTest
implements org.j8unit.repository.java.util.logging.HandlerTests<Handler> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.logging.Handler]

    @Override
    public Handler createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.logging.Handler], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.logging.Handler]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.logging.Handler]

}
