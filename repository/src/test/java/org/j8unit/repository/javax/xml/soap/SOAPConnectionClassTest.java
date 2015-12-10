package org.j8unit.repository.javax.xml.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SOAPConnectionClassTest
implements org.j8unit.repository.javax.xml.soap.SOAPConnectionClassTests<javax.xml.soap.SOAPConnection> {

    @Override
    public Class<javax.xml.soap.SOAPConnection> createNewSUT() {
        return javax.xml.soap.SOAPConnection.class;
    }

}
