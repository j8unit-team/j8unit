package org.j8unit.repository.javax.xml.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SOAPExceptionClassTest
implements org.j8unit.repository.javax.xml.soap.SOAPExceptionClassTests<javax.xml.soap.SOAPException> {

    @Override
    public Class<javax.xml.soap.SOAPException> createNewSUT() {
        return javax.xml.soap.SOAPException.class;
    }

}
