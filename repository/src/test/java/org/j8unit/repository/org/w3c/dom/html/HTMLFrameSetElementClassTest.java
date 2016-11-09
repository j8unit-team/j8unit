package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLFrameSetElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLFrameSetElement} (by simply reusing
 * the J8Unit test interface {@link HTMLFrameSetElementClassTests}).
 */

@RunWith(J8Unit4.class)
public class HTMLFrameSetElementClassTest
implements HTMLFrameSetElementClassTests<HTMLFrameSetElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLFrameSetElement]

    @Override
    public Class<HTMLFrameSetElement> createNewSUT() {
        return HTMLFrameSetElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLFrameSetElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLFrameSetElement]

}
