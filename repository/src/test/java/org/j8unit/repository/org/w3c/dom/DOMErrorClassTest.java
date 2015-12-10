package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DOMErrorClassTest
implements org.j8unit.repository.org.w3c.dom.DOMErrorClassTests<org.w3c.dom.DOMError> {

    @Override
    public Class<org.w3c.dom.DOMError> createNewSUT() {
        return org.w3c.dom.DOMError.class;
    }

}
