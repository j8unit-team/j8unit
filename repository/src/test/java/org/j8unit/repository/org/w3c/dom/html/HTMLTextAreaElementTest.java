package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLTextAreaElement;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link HTMLTextAreaElement} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.html.HTMLTextAreaElementTests}).
 */
@RunWith(J8Unit4.class)
public class HTMLTextAreaElementTest
implements HTMLTextAreaElementTests<HTMLTextAreaElement> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.html.HTMLTextAreaElement]

    @Override
    public HTMLTextAreaElement createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.w3c.dom.html.HTMLTextAreaElement], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.w3c.dom.html.HTMLTextAreaElement]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.w3c.dom.html.HTMLTextAreaElement]

}
