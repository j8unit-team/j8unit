package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLHeadingElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLHeadingElement} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.html.HTMLHeadingElementClassTests}).
 */
@RunWith(J8Unit4.class)
public class HTMLHeadingElementClassTest
implements HTMLHeadingElementClassTests<HTMLHeadingElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLHeadingElement]

    @Override
    public Class<HTMLHeadingElement> createNewSUT() {
        return HTMLHeadingElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLHeadingElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLHeadingElement]

}
