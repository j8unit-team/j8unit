package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLSelectElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLSelectElement} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.html.HTMLSelectElementClassTests}).
 */

@RunWith(J8Unit4.class)
public class HTMLSelectElementClassTest
implements HTMLSelectElementClassTests<HTMLSelectElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLSelectElement]

    @Override
    public Class<HTMLSelectElement> createNewSUT() {
        return HTMLSelectElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLSelectElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLSelectElement]

}
