package org.j8unit.repository.javax.xml.soap;

import javax.xml.soap.Node;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NodeTest
implements org.j8unit.repository.javax.xml.soap.NodeTests<Node> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.soap.Node]

    @Override
    public Node createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.soap.Node], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.soap.Node]

}
