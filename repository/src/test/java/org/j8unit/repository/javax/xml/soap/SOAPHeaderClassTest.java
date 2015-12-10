package org.j8unit.repository.javax.xml.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SOAPHeaderClassTest
implements org.j8unit.repository.javax.xml.soap.SOAPHeaderClassTests<javax.xml.soap.SOAPHeader> {

    @Override
    public Class<javax.xml.soap.SOAPHeader> createNewSUT() {
        return javax.xml.soap.SOAPHeader.class;
    }

}
