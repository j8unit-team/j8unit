package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLQuoteElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLQuoteElement} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.html.HTMLQuoteElementClassTests}).
 */

@RunWith(J8Unit4.class)
public class HTMLQuoteElementClassTest
implements HTMLQuoteElementClassTests<HTMLQuoteElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLQuoteElement]

    @Override
    public Class<HTMLQuoteElement> createNewSUT() {
        return HTMLQuoteElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLQuoteElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLQuoteElement]

}
