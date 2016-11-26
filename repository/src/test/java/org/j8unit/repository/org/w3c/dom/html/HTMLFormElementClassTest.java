package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLFormElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLFormElement} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.html.HTMLFormElementClassTests}).
 */
@RunWith(J8Unit4.class)
public class HTMLFormElementClassTest
implements HTMLFormElementClassTests<HTMLFormElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLFormElement]

    @Override
    public Class<HTMLFormElement> createNewSUT() {
        return HTMLFormElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLFormElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLFormElement]

}
