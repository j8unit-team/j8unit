package org.j8unit.repository.javax.xml.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SOAPBodyClassTest
implements org.j8unit.repository.javax.xml.soap.SOAPBodyClassTests<javax.xml.soap.SOAPBody> {

    @Override
    public Class<javax.xml.soap.SOAPBody> createNewSUT() {
        return javax.xml.soap.SOAPBody.class;
    }

}
