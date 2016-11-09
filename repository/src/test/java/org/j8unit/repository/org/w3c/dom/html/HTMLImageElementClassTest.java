package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLImageElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLImageElement} (by simply reusing the
 * J8Unit test interface {@link HTMLImageElementClassTests}).
 */

@RunWith(J8Unit4.class)
public class HTMLImageElementClassTest
implements HTMLImageElementClassTests<HTMLImageElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLImageElement]

    @Override
    public Class<HTMLImageElement> createNewSUT() {
        return HTMLImageElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLImageElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLImageElement]

}
