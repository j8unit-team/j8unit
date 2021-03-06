package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLTextAreaElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLTextAreaElement} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.html.HTMLTextAreaElementClassTests}).
 */
@RunWith(J8Unit4.class)
public class HTMLTextAreaElementClassTest
implements HTMLTextAreaElementClassTests<HTMLTextAreaElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLTextAreaElement]

    @Override
    public Class<HTMLTextAreaElement> createNewSUT() {
        return HTMLTextAreaElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLTextAreaElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLTextAreaElement]

}
