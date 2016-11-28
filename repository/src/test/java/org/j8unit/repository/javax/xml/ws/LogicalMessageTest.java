package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.LogicalMessage;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link LogicalMessage} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.ws.LogicalMessageTests}).
 */
@RunWith(J8Unit4.class)
public class LogicalMessageTest
implements LogicalMessageTests<LogicalMessage> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.LogicalMessage]

    @Override
    public LogicalMessage createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.ws.LogicalMessage], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.LogicalMessage]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.LogicalMessage]

}
