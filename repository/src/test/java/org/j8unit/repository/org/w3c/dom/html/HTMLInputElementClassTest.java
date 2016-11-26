package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLInputElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLInputElement} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.html.HTMLInputElementClassTests}).
 */
@RunWith(J8Unit4.class)
public class HTMLInputElementClassTest
implements HTMLInputElementClassTests<HTMLInputElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLInputElement]

    @Override
    public Class<HTMLInputElement> createNewSUT() {
        return HTMLInputElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLInputElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLInputElement]

}
