package org.j8unit.repository.javax.xml.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SOAPFaultElementClassTest
implements org.j8unit.repository.javax.xml.soap.SOAPFaultElementClassTests<javax.xml.soap.SOAPFaultElement> {

    @Override
    public Class<javax.xml.soap.SOAPFaultElement> createNewSUT() {
        return javax.xml.soap.SOAPFaultElement.class;
    }

}
