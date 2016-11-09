package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLLIElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLLIElement} (by simply reusing the
 * J8Unit test interface {@link HTMLLIElementClassTests}).
 */

@RunWith(J8Unit4.class)
public class HTMLLIElementClassTest
implements HTMLLIElementClassTests<HTMLLIElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLLIElement]

    @Override
    public Class<HTMLLIElement> createNewSUT() {
        return HTMLLIElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLLIElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLLIElement]

}
