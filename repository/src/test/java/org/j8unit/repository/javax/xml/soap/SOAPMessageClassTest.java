package org.j8unit.repository.javax.xml.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SOAPMessageClassTest
implements org.j8unit.repository.javax.xml.soap.SOAPMessageClassTests<javax.xml.soap.SOAPMessage> {

    @Override
    public Class<javax.xml.soap.SOAPMessage> createNewSUT() {
        return javax.xml.soap.SOAPMessage.class;
    }

}
