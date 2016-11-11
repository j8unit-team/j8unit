package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.DOMStringList;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DOMStringList} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.DOMStringListClassTests}).
 */

@RunWith(J8Unit4.class)
public class DOMStringListClassTest
implements DOMStringListClassTests<DOMStringList> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.DOMStringList]

    @Override
    public Class<DOMStringList> createNewSUT() {
        return DOMStringList.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.DOMStringList]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.DOMStringList]

}
