package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLTableSectionElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLTableSectionElement} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.html.HTMLTableSectionElementClassTests}).
 */

@RunWith(J8Unit4.class)
public class HTMLTableSectionElementClassTest
implements HTMLTableSectionElementClassTests<HTMLTableSectionElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLTableSectionElement]

    @Override
    public Class<HTMLTableSectionElement> createNewSUT() {
        return HTMLTableSectionElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLTableSectionElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLTableSectionElement]

}
