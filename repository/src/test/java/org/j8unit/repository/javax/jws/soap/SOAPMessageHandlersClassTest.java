package org.j8unit.repository.javax.jws.soap;

import javax.jws.soap.SOAPMessageHandlers;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SOAPMessageHandlers} (by simply reusing
 * the J8Unit test interface {@link SOAPMessageHandlersClassTests}).
 */

@RunWith(J8Unit4.class)
public class SOAPMessageHandlersClassTest
implements SOAPMessageHandlersClassTests<SOAPMessageHandlers> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.jws.soap.SOAPMessageHandlers]

    @Override
    public Class<SOAPMessageHandlers> createNewSUT() {
        return SOAPMessageHandlers.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.jws.soap.SOAPMessageHandlers]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.jws.soap.SOAPMessageHandlers]

}
