package org.j8unit.repository.javax.xml.soap;

import javax.xml.soap.SOAPBodyElement;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SOAPBodyElement} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.soap.SOAPBodyElementClassTests}).
 */

@RunWith(J8Unit4.class)
public class SOAPBodyElementClassTest
implements SOAPBodyElementClassTests<SOAPBodyElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.soap.SOAPBodyElement]

    @Override
    public Class<SOAPBodyElement> createNewSUT() {
        return SOAPBodyElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.soap.SOAPBodyElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.soap.SOAPBodyElement]

}
