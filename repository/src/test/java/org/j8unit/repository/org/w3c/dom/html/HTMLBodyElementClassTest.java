package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLBodyElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLBodyElement} (by simply reusing the
 * J8Unit test interface {@link HTMLBodyElementClassTests}).
 */

@RunWith(J8Unit4.class)
public class HTMLBodyElementClassTest
implements HTMLBodyElementClassTests<HTMLBodyElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLBodyElement]

    @Override
    public Class<HTMLBodyElement> createNewSUT() {
        return HTMLBodyElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLBodyElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLBodyElement]

}
