package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLUListElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLUListElement} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.html.HTMLUListElementClassTests}).
 */

@RunWith(J8Unit4.class)
public class HTMLUListElementClassTest
implements HTMLUListElementClassTests<HTMLUListElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLUListElement]

    @Override
    public Class<HTMLUListElement> createNewSUT() {
        return HTMLUListElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLUListElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLUListElement]

}
