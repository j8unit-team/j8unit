package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLSelectElement;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link HTMLSelectElement} (by simply reusing
 * the J8Unit test interface {@link HTMLSelectElementTests}).
 */

@RunWith(J8Unit4.class)
public class HTMLSelectElementTest
implements HTMLSelectElementTests<HTMLSelectElement> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.html.HTMLSelectElement]

    @Override
    public HTMLSelectElement createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.w3c.dom.html.HTMLSelectElement], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.w3c.dom.html.HTMLSelectElement]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.w3c.dom.html.HTMLSelectElement]

}
