package org.j8unit.repository.javax.xml.soap;

import javax.xml.soap.SOAPFault;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SOAPFault} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.soap.SOAPFaultClassTests}).
 */
@RunWith(J8Unit4.class)
public class SOAPFaultClassTest
implements SOAPFaultClassTests<SOAPFault> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.soap.SOAPFault]

    @Override
    public Class<SOAPFault> createNewSUT() {
        return SOAPFault.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.soap.SOAPFault]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.soap.SOAPFault]

}
