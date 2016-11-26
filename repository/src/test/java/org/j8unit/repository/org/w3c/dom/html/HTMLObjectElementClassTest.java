package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLObjectElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLObjectElement} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.html.HTMLObjectElementClassTests}).
 */
@RunWith(J8Unit4.class)
public class HTMLObjectElementClassTest
implements HTMLObjectElementClassTests<HTMLObjectElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLObjectElement]

    @Override
    public Class<HTMLObjectElement> createNewSUT() {
        return HTMLObjectElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLObjectElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLObjectElement]

}
