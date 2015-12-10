package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NodeClassTest
implements org.j8unit.repository.org.w3c.dom.NodeClassTests<org.w3c.dom.Node> {

    @Override
    public Class<org.w3c.dom.Node> createNewSUT() {
        return org.w3c.dom.Node.class;
    }

}
