package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLButtonElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLButtonElement} (by simply reusing the
 * J8Unit test interface {@link HTMLButtonElementClassTests}).
 */

@RunWith(J8Unit4.class)
public class HTMLButtonElementClassTest
implements HTMLButtonElementClassTests<HTMLButtonElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLButtonElement]

    @Override
    public Class<HTMLButtonElement> createNewSUT() {
        return HTMLButtonElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLButtonElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLButtonElement]

}
