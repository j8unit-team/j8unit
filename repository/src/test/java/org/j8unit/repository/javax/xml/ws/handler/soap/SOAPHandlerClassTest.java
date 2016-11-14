package org.j8unit.repository.javax.xml.ws.handler.soap;

import javax.xml.ws.handler.soap.SOAPHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SOAPHandler} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.ws.handler.soap.SOAPHandlerClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class SOAPHandlerClassTest
implements SOAPHandlerClassTests<SOAPHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.handler.soap.SOAPHandler]

    @Override
    public Class<SOAPHandler> createNewSUT() {
        return SOAPHandler.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.ws.handler.soap.SOAPHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.handler.soap.SOAPHandler]

}
