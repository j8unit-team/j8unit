package org.j8unit.repository.javax.xml.ws.soap;

import javax.xml.ws.soap.SOAPFaultException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SOAPFaultException} (by simply
 * reusing the J8Unit test interface {@link SOAPFaultExceptionTests}).
 */

@RunWith(J8Unit4.class)
public class SOAPFaultExceptionTest
implements SOAPFaultExceptionTests<SOAPFaultException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.soap.SOAPFaultException]

    @Override
    public SOAPFaultException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.xml.ws.soap.SOAPFaultException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.soap.SOAPFaultException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.soap.SOAPFaultException]

}
