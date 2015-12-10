package org.j8unit.repository.org.w3c.dom.traversal;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NodeIteratorClassTest
implements org.j8unit.repository.org.w3c.dom.traversal.NodeIteratorClassTests<org.w3c.dom.traversal.NodeIterator> {

    @Override
    public Class<org.w3c.dom.traversal.NodeIterator> createNewSUT() {
        return org.w3c.dom.traversal.NodeIterator.class;
    }

}
