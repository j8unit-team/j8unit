package org.j8unit.repository.javax.jws.soap;

import javax.jws.soap.SOAPMessageHandlers;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SOAPMessageHandlers} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.jws.soap.SOAPMessageHandlersTests}).
 */
@RunWith(J8Unit4.class)
@SuppressWarnings("deprecation")
public class SOAPMessageHandlersTest
implements SOAPMessageHandlersTests<SOAPMessageHandlers> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.jws.soap.SOAPMessageHandlers]

    @Override
    public SOAPMessageHandlers createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.jws.soap.SOAPMessageHandlers], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.jws.soap.SOAPMessageHandlers]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.jws.soap.SOAPMessageHandlers]

}
