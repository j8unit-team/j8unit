package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLHeadElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLHeadElement} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.html.HTMLHeadElementClassTests}).
 */

@RunWith(J8Unit4.class)
public class HTMLHeadElementClassTest
implements HTMLHeadElementClassTests<HTMLHeadElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLHeadElement]

    @Override
    public Class<HTMLHeadElement> createNewSUT() {
        return HTMLHeadElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLHeadElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLHeadElement]

}
