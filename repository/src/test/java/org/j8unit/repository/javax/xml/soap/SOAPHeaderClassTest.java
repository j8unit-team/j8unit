package org.j8unit.repository.javax.xml.soap;

import javax.xml.soap.SOAPHeader;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SOAPHeaderClassTest
implements org.j8unit.repository.javax.xml.soap.SOAPHeaderClassTests<SOAPHeader> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.soap.SOAPHeader]

    @Override
    public Class<SOAPHeader> createNewSUT() {
        return SOAPHeader.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.soap.SOAPHeader]

}
