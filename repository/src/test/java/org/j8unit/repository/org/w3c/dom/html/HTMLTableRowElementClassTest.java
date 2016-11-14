package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLTableRowElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLTableRowElement} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.html.HTMLTableRowElementClassTests}).
 */

@RunWith(J8Unit4.class)
public class HTMLTableRowElementClassTest
implements HTMLTableRowElementClassTests<HTMLTableRowElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLTableRowElement]

    @Override
    public Class<HTMLTableRowElement> createNewSUT() {
        return HTMLTableRowElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLTableRowElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLTableRowElement]

}
