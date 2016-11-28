package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLDivElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLDivElement} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.html.HTMLDivElementClassTests}).
 */
@RunWith(J8Unit4.class)
public class HTMLDivElementClassTest
implements HTMLDivElementClassTests<HTMLDivElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLDivElement]

    @Override
    public Class<HTMLDivElement> createNewSUT() {
        return HTMLDivElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLDivElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLDivElement]

}
