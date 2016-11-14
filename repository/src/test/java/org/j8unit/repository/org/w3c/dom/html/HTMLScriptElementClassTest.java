package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLScriptElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLScriptElement} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.html.HTMLScriptElementClassTests}).
 */

@RunWith(J8Unit4.class)
public class HTMLScriptElementClassTest
implements HTMLScriptElementClassTests<HTMLScriptElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLScriptElement]

    @Override
    public Class<HTMLScriptElement> createNewSUT() {
        return HTMLScriptElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLScriptElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLScriptElement]

}
