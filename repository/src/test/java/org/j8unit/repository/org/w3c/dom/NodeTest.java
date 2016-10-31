package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.w3c.dom.Node;

@RunWith(J8Unit4.class)
public class NodeTest
implements org.j8unit.repository.org.w3c.dom.NodeTests<Node> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.Node]

    @Override
    public Node createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.w3c.dom.Node], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.w3c.dom.Node]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.w3c.dom.Node]

}
