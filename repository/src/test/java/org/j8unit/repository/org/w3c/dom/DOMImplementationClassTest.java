package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.DOMImplementation;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DOMImplementation} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.DOMImplementationClassTests}).
 */

@RunWith(J8Unit4.class)
public class DOMImplementationClassTest
implements DOMImplementationClassTests<DOMImplementation> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.DOMImplementation]

    @Override
    public Class<DOMImplementation> createNewSUT() {
        return DOMImplementation.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.DOMImplementation]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.DOMImplementation]

}
