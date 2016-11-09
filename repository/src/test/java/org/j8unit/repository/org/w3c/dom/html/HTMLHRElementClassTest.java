package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLHRElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLHRElement} (by simply reusing the
 * J8Unit test interface {@link HTMLHRElementClassTests}).
 */

@RunWith(J8Unit4.class)
public class HTMLHRElementClassTest
implements HTMLHRElementClassTests<HTMLHRElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLHRElement]

    @Override
    public Class<HTMLHRElement> createNewSUT() {
        return HTMLHRElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLHRElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLHRElement]

}
