package org.j8unit.repository.javax.xml.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SOAPPartClassTest
implements org.j8unit.repository.javax.xml.soap.SOAPPartClassTests<javax.xml.soap.SOAPPart> {

    @Override
    public Class<javax.xml.soap.SOAPPart> createNewSUT() {
        return javax.xml.soap.SOAPPart.class;
    }

}
