package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLMenuElement;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link HTMLMenuElement} (by simply reusing
 * the J8Unit test interface {@link HTMLMenuElementTests}).
 */

@RunWith(J8Unit4.class)
public class HTMLMenuElementTest
implements HTMLMenuElementTests<HTMLMenuElement> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.html.HTMLMenuElement]

    @Override
    public HTMLMenuElement createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.w3c.dom.html.HTMLMenuElement], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.w3c.dom.html.HTMLMenuElement]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.w3c.dom.html.HTMLMenuElement]

}
