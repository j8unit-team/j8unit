package org.j8unit.repository.javax.xml.ws.handler;

import javax.xml.ws.handler.LogicalMessageContext;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LogicalMessageContext} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.ws.handler.LogicalMessageContextClassTests}).
 */
@RunWith(J8Unit4.class)
public class LogicalMessageContextClassTest
implements LogicalMessageContextClassTests<LogicalMessageContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.handler.LogicalMessageContext]

    @Override
    public Class<LogicalMessageContext> createNewSUT() {
        return LogicalMessageContext.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.ws.handler.LogicalMessageContext]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.handler.LogicalMessageContext]

}
