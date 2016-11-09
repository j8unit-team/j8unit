package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLAnchorElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLAnchorElement} (by simply reusing the
 * J8Unit test interface {@link HTMLAnchorElementClassTests}).
 */

@RunWith(J8Unit4.class)
public class HTMLAnchorElementClassTest
implements HTMLAnchorElementClassTests<HTMLAnchorElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLAnchorElement]

    @Override
    public Class<HTMLAnchorElement> createNewSUT() {
        return HTMLAnchorElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLAnchorElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLAnchorElement]

}
