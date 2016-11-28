package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLTableElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLTableElement} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.html.HTMLTableElementClassTests}).
 */
@RunWith(J8Unit4.class)
public class HTMLTableElementClassTest
implements HTMLTableElementClassTests<HTMLTableElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLTableElement]

    @Override
    public Class<HTMLTableElement> createNewSUT() {
        return HTMLTableElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLTableElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLTableElement]

}
