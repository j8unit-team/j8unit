package org.j8unit.repository.javax.xml.soap;

import javax.xml.soap.SOAPHeaderElement;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SOAPHeaderElement} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.soap.SOAPHeaderElementClassTests}).
 */

@RunWith(J8Unit4.class)
public class SOAPHeaderElementClassTest
implements SOAPHeaderElementClassTests<SOAPHeaderElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.soap.SOAPHeaderElement]

    @Override
    public Class<SOAPHeaderElement> createNewSUT() {
        return SOAPHeaderElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.soap.SOAPHeaderElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.soap.SOAPHeaderElement]

}
