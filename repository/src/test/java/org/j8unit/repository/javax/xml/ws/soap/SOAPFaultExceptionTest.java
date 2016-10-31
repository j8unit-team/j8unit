package org.j8unit.repository.javax.xml.ws.soap;

import javax.xml.ws.soap.SOAPFaultException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SOAPFaultExceptionTest
implements org.j8unit.repository.javax.xml.ws.soap.SOAPFaultExceptionTests<SOAPFaultException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.soap.SOAPFaultException]

    @Override
    public SOAPFaultException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.xml.ws.soap.SOAPFaultException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.soap.SOAPFaultException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.soap.SOAPFaultException]

}
