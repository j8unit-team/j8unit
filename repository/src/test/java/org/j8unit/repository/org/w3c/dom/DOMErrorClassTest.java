package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.DOMError;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DOMError} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.w3c.dom.DOMErrorClassTests}).
 */

@RunWith(J8Unit4.class)
public class DOMErrorClassTest
implements DOMErrorClassTests<DOMError> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.DOMError]

    @Override
    public Class<DOMError> createNewSUT() {
        return DOMError.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.DOMError]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.DOMError]

}
