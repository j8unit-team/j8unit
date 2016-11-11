package org.j8unit.repository.javax.xml.ws.handler.soap;

import javax.xml.ws.handler.soap.SOAPMessageContext;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SOAPMessageContext} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.ws.handler.soap.SOAPMessageContextClassTests}).
 */

@RunWith(J8Unit4.class)
public class SOAPMessageContextClassTest
implements SOAPMessageContextClassTests<SOAPMessageContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.handler.soap.SOAPMessageContext]

    @Override
    public Class<SOAPMessageContext> createNewSUT() {
        return SOAPMessageContext.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.ws.handler.soap.SOAPMessageContext]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.handler.soap.SOAPMessageContext]

}
