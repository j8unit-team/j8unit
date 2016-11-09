package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLParagraphElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLParagraphElement} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.html.HTMLParagraphElementClassTests}).
 */

@RunWith(J8Unit4.class)
public class HTMLParagraphElementClassTest
implements org.j8unit.repository.org.w3c.dom.html.HTMLParagraphElementClassTests<HTMLParagraphElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLParagraphElement]

    @Override
    public Class<HTMLParagraphElement> createNewSUT() {
        return HTMLParagraphElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLParagraphElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLParagraphElement]

}
