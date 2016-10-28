package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.Element;

@RunWith(J8Unit4.class)
public class ElementClassTest
implements org.j8unit.repository.org.w3c.dom.ElementClassTests<Element> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.Element]

    @Override
    public Class<Element> createNewSUT() {
        return Element.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.Element]

}
