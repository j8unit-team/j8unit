package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLBodyElement;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link HTMLBodyElement} (by simply reusing
 * the J8Unit test interface {@link HTMLBodyElementTests}).
 */

@RunWith(J8Unit4.class)
public class HTMLBodyElementTest
implements HTMLBodyElementTests<HTMLBodyElement> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.html.HTMLBodyElement]

    @Override
    public HTMLBodyElement createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.w3c.dom.html.HTMLBodyElement], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.w3c.dom.html.HTMLBodyElement]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.w3c.dom.html.HTMLBodyElement]

}
