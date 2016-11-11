package org.j8unit.repository.org.xml.sax.ext;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.xml.sax.ext.Attributes2;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Attributes2} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.xml.sax.ext.Attributes2ClassTests}).
 */

@RunWith(J8Unit4.class)
public class Attributes2ClassTest
implements Attributes2ClassTests<Attributes2> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.xml.sax.ext.Attributes2]

    @Override
    public Class<Attributes2> createNewSUT() {
        return Attributes2.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.xml.sax.ext.Attributes2]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.xml.sax.ext.Attributes2]

}
