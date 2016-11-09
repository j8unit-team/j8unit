package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLDListElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLDListElement} (by simply reusing the
 * J8Unit test interface {@link HTMLDListElementClassTests}).
 */

@RunWith(J8Unit4.class)
public class HTMLDListElementClassTest
implements HTMLDListElementClassTests<HTMLDListElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLDListElement]

    @Override
    public Class<HTMLDListElement> createNewSUT() {
        return HTMLDListElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLDListElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLDListElement]

}
