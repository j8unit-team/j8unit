package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.DOMErrorHandler;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DOMErrorHandler} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.DOMErrorHandlerClassTests}).
 */
@RunWith(J8Unit4.class)
public class DOMErrorHandlerClassTest
implements DOMErrorHandlerClassTests<DOMErrorHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.DOMErrorHandler]

    @Override
    public Class<DOMErrorHandler> createNewSUT() {
        return DOMErrorHandler.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.DOMErrorHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.DOMErrorHandler]

}
