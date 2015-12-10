package org.j8unit.repository.javax.xml.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SOAPFaultClassTest
implements org.j8unit.repository.javax.xml.soap.SOAPFaultClassTests<javax.xml.soap.SOAPFault> {

    @Override
    public Class<javax.xml.soap.SOAPFault> createNewSUT() {
        return javax.xml.soap.SOAPFault.class;
    }

}
