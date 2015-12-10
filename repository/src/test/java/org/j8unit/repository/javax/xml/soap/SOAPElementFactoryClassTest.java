package org.j8unit.repository.javax.xml.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SOAPElementFactoryClassTest
implements org.j8unit.repository.javax.xml.soap.SOAPElementFactoryClassTests<javax.xml.soap.SOAPElementFactory> {

    @Override
    public Class<javax.xml.soap.SOAPElementFactory> createNewSUT() {
        return javax.xml.soap.SOAPElementFactory.class;
    }

}
