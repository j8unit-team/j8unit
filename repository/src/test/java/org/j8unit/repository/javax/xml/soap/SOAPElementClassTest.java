package org.j8unit.repository.javax.xml.soap;

import javax.xml.soap.SOAPElement;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SOAPElement} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.soap.SOAPElementClassTests}).
 */

@RunWith(J8Unit4.class)
public class SOAPElementClassTest
implements SOAPElementClassTests<SOAPElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.soap.SOAPElement]

    @Override
    public Class<SOAPElement> createNewSUT() {
        return SOAPElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.soap.SOAPElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.soap.SOAPElement]

}
