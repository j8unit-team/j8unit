package org.j8unit.repository.org.xml.sax.ext;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.xml.sax.ext.Locator2;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Locator2} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.xml.sax.ext.Locator2ClassTests}).
 */

@RunWith(J8Unit4.class)
public class Locator2ClassTest
implements Locator2ClassTests<Locator2> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.xml.sax.ext.Locator2]

    @Override
    public Class<Locator2> createNewSUT() {
        return Locator2.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.xml.sax.ext.Locator2]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.xml.sax.ext.Locator2]

}
