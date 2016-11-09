package org.j8unit.repository.javax.xml;

import javax.xml.XMLConstants;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XMLConstants} (by simply reusing the
 * J8Unit test interface {@link XMLConstantsClassTests}).
 */

@RunWith(J8Unit4.class)
public class XMLConstantsClassTest
implements XMLConstantsClassTests<XMLConstants> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.XMLConstants]

    @Override
    public Class<XMLConstants> createNewSUT() {
        return XMLConstants.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.XMLConstants]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.XMLConstants]

}
