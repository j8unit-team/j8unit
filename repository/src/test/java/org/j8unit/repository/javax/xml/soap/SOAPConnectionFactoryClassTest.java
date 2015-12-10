package org.j8unit.repository.javax.xml.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SOAPConnectionFactoryClassTest
implements org.j8unit.repository.javax.xml.soap.SOAPConnectionFactoryClassTests<javax.xml.soap.SOAPConnectionFactory> {

    @Override
    public Class<javax.xml.soap.SOAPConnectionFactory> createNewSUT() {
        return javax.xml.soap.SOAPConnectionFactory.class;
    }

}
