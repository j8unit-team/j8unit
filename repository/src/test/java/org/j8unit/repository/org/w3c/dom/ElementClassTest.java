package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ElementClassTest
implements org.j8unit.repository.org.w3c.dom.ElementClassTests<org.w3c.dom.Element> {

    @Override
    public Class<org.w3c.dom.Element> createNewSUT() {
        return org.w3c.dom.Element.class;
    }

}
