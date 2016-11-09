package org.j8unit.repository.javax.xml.soap;

import javax.xml.soap.SOAPFaultElement;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SOAPFaultElement} (by simply reusing the
 * J8Unit test interface {@link SOAPFaultElementClassTests}).
 */

@RunWith(J8Unit4.class)
public class SOAPFaultElementClassTest
implements SOAPFaultElementClassTests<SOAPFaultElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.soap.SOAPFaultElement]

    @Override
    public Class<SOAPFaultElement> createNewSUT() {
        return SOAPFaultElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.soap.SOAPFaultElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.soap.SOAPFaultElement]

}
