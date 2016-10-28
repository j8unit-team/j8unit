package org.j8unit.repository.javax.xml.soap;

import javax.xml.soap.SOAPFault;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SOAPFaultClassTest
implements org.j8unit.repository.javax.xml.soap.SOAPFaultClassTests<SOAPFault> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.soap.SOAPFault]

    @Override
    public Class<SOAPFault> createNewSUT() {
        return SOAPFault.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.soap.SOAPFault]

}
