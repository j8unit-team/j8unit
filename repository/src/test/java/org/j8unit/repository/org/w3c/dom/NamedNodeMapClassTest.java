package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.NamedNodeMap;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NamedNodeMap} (by simply reusing the
 * J8Unit test interface {@link NamedNodeMapClassTests}).
 */

@RunWith(J8Unit4.class)
public class NamedNodeMapClassTest
implements NamedNodeMapClassTests<NamedNodeMap> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.NamedNodeMap]

    @Override
    public Class<NamedNodeMap> createNewSUT() {
        return NamedNodeMap.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.NamedNodeMap]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.NamedNodeMap]

}
