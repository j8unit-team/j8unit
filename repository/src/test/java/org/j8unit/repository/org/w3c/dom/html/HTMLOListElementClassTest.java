package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLOListElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLOListElement} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.html.HTMLOListElementClassTests}).
 */
@RunWith(J8Unit4.class)
public class HTMLOListElementClassTest
implements HTMLOListElementClassTests<HTMLOListElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLOListElement]

    @Override
    public Class<HTMLOListElement> createNewSUT() {
        return HTMLOListElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLOListElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLOListElement]

}
