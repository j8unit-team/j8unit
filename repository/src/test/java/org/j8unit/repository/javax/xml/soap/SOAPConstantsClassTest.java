package org.j8unit.repository.javax.xml.soap;

import javax.xml.soap.SOAPConstants;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SOAPConstants} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.soap.SOAPConstantsClassTests}).
 */

@RunWith(J8Unit4.class)
public class SOAPConstantsClassTest
implements SOAPConstantsClassTests<SOAPConstants> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.soap.SOAPConstants]

    @Override
    public Class<SOAPConstants> createNewSUT() {
        return SOAPConstants.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.soap.SOAPConstants]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.soap.SOAPConstants]

}
