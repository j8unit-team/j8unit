package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLOptionElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLOptionElement} (by simply reusing the
 * J8Unit test interface {@link HTMLOptionElementClassTests}).
 */

@RunWith(J8Unit4.class)
public class HTMLOptionElementClassTest
implements HTMLOptionElementClassTests<HTMLOptionElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLOptionElement]

    @Override
    public Class<HTMLOptionElement> createNewSUT() {
        return HTMLOptionElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLOptionElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLOptionElement]

}
