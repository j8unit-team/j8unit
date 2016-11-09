package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.DOMImplementationList;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DOMImplementationList} (by simply reusing
 * the J8Unit test interface {@link DOMImplementationListClassTests}).
 */

@RunWith(J8Unit4.class)
public class DOMImplementationListClassTest
implements DOMImplementationListClassTests<DOMImplementationList> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.DOMImplementationList]

    @Override
    public Class<DOMImplementationList> createNewSUT() {
        return DOMImplementationList.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.DOMImplementationList]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.DOMImplementationList]

}
