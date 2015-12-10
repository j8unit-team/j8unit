package org.j8unit.repository.javax.xml.ws.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SOAPFaultExceptionTest
implements org.j8unit.repository.javax.xml.ws.soap.SOAPFaultExceptionTests<javax.xml.ws.soap.SOAPFaultException> {

    @Override
    public javax.xml.ws.soap.SOAPFaultException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.xml.ws.soap.SOAPFaultException] available.");
    }

}
