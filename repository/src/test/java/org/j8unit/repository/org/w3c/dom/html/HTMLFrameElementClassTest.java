package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLFrameElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLFrameElement} (by simply reusing the
 * J8Unit test interface {@link HTMLFrameElementClassTests}).
 */

@RunWith(J8Unit4.class)
public class HTMLFrameElementClassTest
implements HTMLFrameElementClassTests<HTMLFrameElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLFrameElement]

    @Override
    public Class<HTMLFrameElement> createNewSUT() {
        return HTMLFrameElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLFrameElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLFrameElement]

}
