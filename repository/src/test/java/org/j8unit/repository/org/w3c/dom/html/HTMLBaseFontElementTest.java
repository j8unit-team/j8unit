package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLBaseFontElement;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link HTMLBaseFontElement} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.html.HTMLBaseFontElementTests}).
 */
@RunWith(J8Unit4.class)
public class HTMLBaseFontElementTest
implements HTMLBaseFontElementTests<HTMLBaseFontElement> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.html.HTMLBaseFontElement]

    @Override
    public HTMLBaseFontElement createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.w3c.dom.html.HTMLBaseFontElement], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.w3c.dom.html.HTMLBaseFontElement]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.w3c.dom.html.HTMLBaseFontElement]

}
