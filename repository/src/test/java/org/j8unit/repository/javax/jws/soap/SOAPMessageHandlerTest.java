package org.j8unit.repository.javax.jws.soap;

import javax.jws.soap.SOAPMessageHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SOAPMessageHandler} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.jws.soap.SOAPMessageHandlerTests}).
 */
@RunWith(J8Unit4.class)
@SuppressWarnings("deprecation")
public class SOAPMessageHandlerTest
implements SOAPMessageHandlerTests<SOAPMessageHandler> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.jws.soap.SOAPMessageHandler]

    @Override
    public SOAPMessageHandler createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.jws.soap.SOAPMessageHandler], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.jws.soap.SOAPMessageHandler]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.jws.soap.SOAPMessageHandler]

}
