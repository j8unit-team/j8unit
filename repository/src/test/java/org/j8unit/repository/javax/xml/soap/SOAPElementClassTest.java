package org.j8unit.repository.javax.xml.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SOAPElementClassTest
implements org.j8unit.repository.javax.xml.soap.SOAPElementClassTests<javax.xml.soap.SOAPElement> {

    @Override
    public Class<javax.xml.soap.SOAPElement> createNewSUT() {
        return javax.xml.soap.SOAPElement.class;
    }

}
