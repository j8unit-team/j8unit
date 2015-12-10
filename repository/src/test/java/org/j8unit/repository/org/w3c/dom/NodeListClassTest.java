package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NodeListClassTest
implements org.j8unit.repository.org.w3c.dom.NodeListClassTests<org.w3c.dom.NodeList> {

    @Override
    public Class<org.w3c.dom.NodeList> createNewSUT() {
        return org.w3c.dom.NodeList.class;
    }

}
