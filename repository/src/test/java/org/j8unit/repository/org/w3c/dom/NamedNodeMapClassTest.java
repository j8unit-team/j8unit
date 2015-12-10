package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NamedNodeMapClassTest
implements org.j8unit.repository.org.w3c.dom.NamedNodeMapClassTests<org.w3c.dom.NamedNodeMap> {

    @Override
    public Class<org.w3c.dom.NamedNodeMap> createNewSUT() {
        return org.w3c.dom.NamedNodeMap.class;
    }

}
