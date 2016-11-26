package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLMenuElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLMenuElement} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.html.HTMLMenuElementClassTests}).
 */
@RunWith(J8Unit4.class)
public class HTMLMenuElementClassTest
implements HTMLMenuElementClassTests<HTMLMenuElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLMenuElement]

    @Override
    public Class<HTMLMenuElement> createNewSUT() {
        return HTMLMenuElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLMenuElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLMenuElement]

}
