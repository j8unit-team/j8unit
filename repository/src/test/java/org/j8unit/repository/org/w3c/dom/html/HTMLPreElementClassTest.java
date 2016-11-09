package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLPreElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLPreElement} (by simply reusing the
 * J8Unit test interface {@link HTMLPreElementClassTests}).
 */

@RunWith(J8Unit4.class)
public class HTMLPreElementClassTest
implements HTMLPreElementClassTests<HTMLPreElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLPreElement]

    @Override
    public Class<HTMLPreElement> createNewSUT() {
        return HTMLPreElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLPreElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLPreElement]

}
