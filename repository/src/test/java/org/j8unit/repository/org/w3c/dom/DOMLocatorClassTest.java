package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DOMLocatorClassTest
implements org.j8unit.repository.org.w3c.dom.DOMLocatorClassTests<org.w3c.dom.DOMLocator> {

    @Override
    public Class<org.w3c.dom.DOMLocator> createNewSUT() {
        return org.w3c.dom.DOMLocator.class;
    }

}
