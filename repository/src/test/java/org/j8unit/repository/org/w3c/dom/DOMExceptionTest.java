package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DOMExceptionTest
implements org.j8unit.repository.org.w3c.dom.DOMExceptionTests<org.w3c.dom.DOMException> {

    @Override
    public org.w3c.dom.DOMException createNewSUT() {
        throw new AssertionError("There is no default constructor for [org.w3c.dom.DOMException] available.");
    }

}
