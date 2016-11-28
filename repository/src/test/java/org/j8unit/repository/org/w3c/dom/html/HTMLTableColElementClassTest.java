package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLTableColElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLTableColElement} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.html.HTMLTableColElementClassTests}).
 */
@RunWith(J8Unit4.class)
public class HTMLTableColElementClassTest
implements HTMLTableColElementClassTests<HTMLTableColElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLTableColElement]

    @Override
    public Class<HTMLTableColElement> createNewSUT() {
        return HTMLTableColElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLTableColElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLTableColElement]

}
