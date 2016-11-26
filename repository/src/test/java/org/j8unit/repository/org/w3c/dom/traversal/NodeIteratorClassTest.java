package org.j8unit.repository.org.w3c.dom.traversal;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.traversal.NodeIterator;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NodeIterator} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.traversal.NodeIteratorClassTests}).
 */
@RunWith(J8Unit4.class)
public class NodeIteratorClassTest
implements NodeIteratorClassTests<NodeIterator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.traversal.NodeIterator]

    @Override
    public Class<NodeIterator> createNewSUT() {
        return NodeIterator.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.traversal.NodeIterator]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.traversal.NodeIterator]

}
