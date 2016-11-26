package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLDOMImplementation;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLDOMImplementation} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.html.HTMLDOMImplementationClassTests}).
 */
@RunWith(J8Unit4.class)
public class HTMLDOMImplementationClassTest
implements HTMLDOMImplementationClassTests<HTMLDOMImplementation> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLDOMImplementation]

    @Override
    public Class<HTMLDOMImplementation> createNewSUT() {
        return HTMLDOMImplementation.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLDOMImplementation]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLDOMImplementation]

}
