package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DOMErrorHandlerClassTest
implements org.j8unit.repository.org.w3c.dom.DOMErrorHandlerClassTests<org.w3c.dom.DOMErrorHandler> {

    @Override
    public Class<org.w3c.dom.DOMErrorHandler> createNewSUT() {
        return org.w3c.dom.DOMErrorHandler.class;
    }

}
