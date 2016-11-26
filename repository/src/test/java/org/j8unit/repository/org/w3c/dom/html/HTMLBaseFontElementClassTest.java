package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLBaseFontElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLBaseFontElement} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.html.HTMLBaseFontElementClassTests}).
 */
@RunWith(J8Unit4.class)
public class HTMLBaseFontElementClassTest
implements HTMLBaseFontElementClassTests<HTMLBaseFontElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLBaseFontElement]

    @Override
    public Class<HTMLBaseFontElement> createNewSUT() {
        return HTMLBaseFontElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLBaseFontElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLBaseFontElement]

}
