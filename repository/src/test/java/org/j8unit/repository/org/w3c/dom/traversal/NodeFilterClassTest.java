package org.j8unit.repository.org.w3c.dom.traversal;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NodeFilterClassTest
implements org.j8unit.repository.org.w3c.dom.traversal.NodeFilterClassTests<org.w3c.dom.traversal.NodeFilter> {

    @Override
    public Class<org.w3c.dom.traversal.NodeFilter> createNewSUT() {
        return org.w3c.dom.traversal.NodeFilter.class;
    }

}
