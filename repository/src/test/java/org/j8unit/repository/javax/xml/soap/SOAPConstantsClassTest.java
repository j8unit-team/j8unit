package org.j8unit.repository.javax.xml.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SOAPConstantsClassTest
implements org.j8unit.repository.javax.xml.soap.SOAPConstantsClassTests<javax.xml.soap.SOAPConstants> {

    @Override
    public Class<javax.xml.soap.SOAPConstants> createNewSUT() {
        return javax.xml.soap.SOAPConstants.class;
    }

}
