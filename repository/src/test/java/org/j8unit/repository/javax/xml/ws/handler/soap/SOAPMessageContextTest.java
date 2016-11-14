package org.j8unit.repository.javax.xml.ws.handler.soap;

import javax.xml.ws.handler.soap.SOAPMessageContext;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SOAPMessageContext} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.xml.ws.handler.soap.SOAPMessageContextTests}).
 */

@RunWith(J8Unit4.class)
public class SOAPMessageContextTest
implements SOAPMessageContextTests<SOAPMessageContext> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.handler.soap.SOAPMessageContext]

    @Override
    public SOAPMessageContext createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.ws.handler.soap.SOAPMessageContext], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.handler.soap.SOAPMessageContext]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.handler.soap.SOAPMessageContext]

}
