package org.j8unit.repository.javax.xml.soap;

import javax.xml.soap.SOAPHeader;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SOAPHeader} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.soap.SOAPHeaderClassTests}).
 */
@RunWith(J8Unit4.class)
public class SOAPHeaderClassTest
implements SOAPHeaderClassTests<SOAPHeader> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.soap.SOAPHeader]

    @Override
    public Class<SOAPHeader> createNewSUT() {
        return SOAPHeader.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.soap.SOAPHeader]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.soap.SOAPHeader]

}
