package org.j8unit.repository.javax.xml.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SOAPHeaderElementClassTest
implements org.j8unit.repository.javax.xml.soap.SOAPHeaderElementClassTests<javax.xml.soap.SOAPHeaderElement> {

    @Override
    public Class<javax.xml.soap.SOAPHeaderElement> createNewSUT() {
        return javax.xml.soap.SOAPHeaderElement.class;
    }

}
