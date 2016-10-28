package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.DOMError;

@RunWith(J8Unit4.class)
public class DOMErrorClassTest
implements org.j8unit.repository.org.w3c.dom.DOMErrorClassTests<DOMError> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.DOMError]

    @Override
    public Class<DOMError> createNewSUT() {
        return DOMError.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.DOMError]

}
