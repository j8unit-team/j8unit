package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLModElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLModElement} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.html.HTMLModElementClassTests}).
 */
@RunWith(J8Unit4.class)
public class HTMLModElementClassTest
implements HTMLModElementClassTests<HTMLModElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLModElement]

    @Override
    public Class<HTMLModElement> createNewSUT() {
        return HTMLModElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLModElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLModElement]

}
