package org.j8unit.repository.javax.xml.ws.handler;

import javax.xml.ws.handler.LogicalMessageContext;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link LogicalMessageContext} (by simply
 * reusing the J8Unit test interface {@link LogicalMessageContextTests}).
 */

@RunWith(J8Unit4.class)
public class LogicalMessageContextTest
implements LogicalMessageContextTests<LogicalMessageContext> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.handler.LogicalMessageContext]

    @Override
    public LogicalMessageContext createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.ws.handler.LogicalMessageContext], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.handler.LogicalMessageContext]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.handler.LogicalMessageContext]

}
