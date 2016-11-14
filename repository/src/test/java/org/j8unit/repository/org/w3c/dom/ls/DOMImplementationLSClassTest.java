package org.j8unit.repository.org.w3c.dom.ls;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.ls.DOMImplementationLS;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DOMImplementationLS} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.ls.DOMImplementationLSClassTests}).
 */

@RunWith(J8Unit4.class)
public class DOMImplementationLSClassTest
implements DOMImplementationLSClassTests<DOMImplementationLS> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.ls.DOMImplementationLS]

    @Override
    public Class<DOMImplementationLS> createNewSUT() {
        return DOMImplementationLS.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.ls.DOMImplementationLS]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.ls.DOMImplementationLS]

}
