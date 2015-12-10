package org.j8unit.repository.javax.xml.ws.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SOAPFaultExceptionClassTest
implements org.j8unit.repository.javax.xml.ws.soap.SOAPFaultExceptionClassTests<javax.xml.ws.soap.SOAPFaultException> {

    @Override
    public Class<javax.xml.ws.soap.SOAPFaultException> createNewSUT() {
        return javax.xml.ws.soap.SOAPFaultException.class;
    }

}
