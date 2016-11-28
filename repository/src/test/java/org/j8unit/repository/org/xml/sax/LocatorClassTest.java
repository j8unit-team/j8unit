package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.xml.sax.Locator;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Locator} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.xml.sax.LocatorClassTests}).
 */
@RunWith(J8Unit4.class)
public class LocatorClassTest
implements LocatorClassTests<Locator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.xml.sax.Locator]

    @Override
    public Class<Locator> createNewSUT() {
        return Locator.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.xml.sax.Locator]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.xml.sax.Locator]

}
