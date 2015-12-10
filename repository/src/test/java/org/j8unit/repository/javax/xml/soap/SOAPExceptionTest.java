package org.j8unit.repository.javax.xml.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SOAPExceptionTest
implements org.j8unit.repository.javax.xml.soap.SOAPExceptionTests<javax.xml.soap.SOAPException> {

    @Override
    public javax.xml.soap.SOAPException createNewSUT() {
        return new javax.xml.soap.SOAPException();
    }

}
