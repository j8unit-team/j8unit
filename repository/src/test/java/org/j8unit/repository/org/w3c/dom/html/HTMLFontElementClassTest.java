package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLFontElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLFontElement} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.html.HTMLFontElementClassTests}).
 */

@RunWith(J8Unit4.class)
public class HTMLFontElementClassTest
implements HTMLFontElementClassTests<HTMLFontElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLFontElement]

    @Override
    public Class<HTMLFontElement> createNewSUT() {
        return HTMLFontElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLFontElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLFontElement]

}
