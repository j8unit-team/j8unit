package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLLinkElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLLinkElement} (by simply reusing the
 * J8Unit test interface {@link HTMLLinkElementClassTests}).
 */

@RunWith(J8Unit4.class)
public class HTMLLinkElementClassTest
implements HTMLLinkElementClassTests<HTMLLinkElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLLinkElement]

    @Override
    public Class<HTMLLinkElement> createNewSUT() {
        return HTMLLinkElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLLinkElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLLinkElement]

}
