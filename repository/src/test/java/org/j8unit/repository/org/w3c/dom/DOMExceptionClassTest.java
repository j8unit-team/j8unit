package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DOMExceptionClassTest
implements org.j8unit.repository.org.w3c.dom.DOMExceptionClassTests<org.w3c.dom.DOMException> {

    @Override
    public Class<org.w3c.dom.DOMException> createNewSUT() {
        return org.w3c.dom.DOMException.class;
    }

}
