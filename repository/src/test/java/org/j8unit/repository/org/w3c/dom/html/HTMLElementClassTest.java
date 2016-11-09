package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLElement} (by simply reusing the
 * J8Unit test interface {@link HTMLElementClassTests}).
 */

@RunWith(J8Unit4.class)
public class HTMLElementClassTest
implements HTMLElementClassTests<HTMLElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLElement]

    @Override
    public Class<HTMLElement> createNewSUT() {
        return HTMLElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLElement]

}
