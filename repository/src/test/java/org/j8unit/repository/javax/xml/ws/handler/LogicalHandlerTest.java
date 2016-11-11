package org.j8unit.repository.javax.xml.ws.handler;

import javax.xml.ws.handler.LogicalHandler;
import javax.xml.ws.handler.LogicalMessageContext;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link LogicalHandler} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.ws.handler.LogicalHandlerTests}).
 */

@RunWith(J8Unit4.class)
public class LogicalHandlerTest<C extends LogicalMessageContext>
implements LogicalHandlerTests<LogicalHandler<C>, C> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.handler.LogicalHandler]

    @Override
    public LogicalHandler<C> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.ws.handler.LogicalHandler], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.handler.LogicalHandler]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.handler.LogicalHandler]

}
