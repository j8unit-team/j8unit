package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLLabelElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLLabelElement} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.html.HTMLLabelElementClassTests}).
 */

@RunWith(J8Unit4.class)
public class HTMLLabelElementClassTest
implements HTMLLabelElementClassTests<HTMLLabelElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLLabelElement]

    @Override
    public Class<HTMLLabelElement> createNewSUT() {
        return HTMLLabelElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLLabelElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLLabelElement]

}
