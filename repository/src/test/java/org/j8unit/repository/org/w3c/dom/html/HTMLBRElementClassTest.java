package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLBRElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLBRElement} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.html.HTMLBRElementClassTests}).
 */

@RunWith(J8Unit4.class)
public class HTMLBRElementClassTest
implements HTMLBRElementClassTests<HTMLBRElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLBRElement]

    @Override
    public Class<HTMLBRElement> createNewSUT() {
        return HTMLBRElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLBRElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLBRElement]

}
