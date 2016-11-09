package org.j8unit.repository.org.w3c.dom.traversal;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.traversal.NodeFilter;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NodeFilter} (by simply reusing the J8Unit
 * test interface {@link NodeFilterClassTests}).
 */

@RunWith(J8Unit4.class)
public class NodeFilterClassTest
implements NodeFilterClassTests<NodeFilter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.traversal.NodeFilter]

    @Override
    public Class<NodeFilter> createNewSUT() {
        return NodeFilter.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.traversal.NodeFilter]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.traversal.NodeFilter]

}
