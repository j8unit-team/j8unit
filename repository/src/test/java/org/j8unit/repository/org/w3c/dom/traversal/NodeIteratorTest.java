package org.j8unit.repository.org.w3c.dom.traversal;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.w3c.dom.traversal.NodeIterator;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link NodeIterator} (by simply reusing the
 * J8Unit test interface {@link NodeIteratorTests}).
 */

@RunWith(J8Unit4.class)
public class NodeIteratorTest
implements NodeIteratorTests<NodeIterator> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.traversal.NodeIterator]

    @Override
    public NodeIterator createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.w3c.dom.traversal.NodeIterator], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.w3c.dom.traversal.NodeIterator]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.w3c.dom.traversal.NodeIterator]

}
