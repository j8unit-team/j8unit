package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLTitleElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLTitleElement} (by simply reusing the
 * J8Unit test interface {@link HTMLTitleElementClassTests}).
 */

@RunWith(J8Unit4.class)
public class HTMLTitleElementClassTest
implements HTMLTitleElementClassTests<HTMLTitleElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLTitleElement]

    @Override
    public Class<HTMLTitleElement> createNewSUT() {
        return HTMLTitleElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLTitleElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLTitleElement]

}
