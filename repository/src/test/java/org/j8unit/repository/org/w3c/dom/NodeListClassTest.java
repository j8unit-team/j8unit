package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.NodeList;

@RunWith(J8Unit4.class)
public class NodeListClassTest
implements org.j8unit.repository.org.w3c.dom.NodeListClassTests<NodeList> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.NodeList]

    @Override
    public Class<NodeList> createNewSUT() {
        return NodeList.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.NodeList]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.NodeList]

}
