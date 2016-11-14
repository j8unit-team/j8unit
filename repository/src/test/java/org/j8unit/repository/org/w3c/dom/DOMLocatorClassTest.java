package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.DOMLocator;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DOMLocator} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.w3c.dom.DOMLocatorClassTests}).
 */

@RunWith(J8Unit4.class)
public class DOMLocatorClassTest
implements DOMLocatorClassTests<DOMLocator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.DOMLocator]

    @Override
    public Class<DOMLocator> createNewSUT() {
        return DOMLocator.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.DOMLocator]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.DOMLocator]

}
