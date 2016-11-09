package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLAreaElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLAreaElement} (by simply reusing the
 * J8Unit test interface {@link HTMLAreaElementClassTests}).
 */

@RunWith(J8Unit4.class)
public class HTMLAreaElementClassTest
implements HTMLAreaElementClassTests<HTMLAreaElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLAreaElement]

    @Override
    public Class<HTMLAreaElement> createNewSUT() {
        return HTMLAreaElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLAreaElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLAreaElement]

}
