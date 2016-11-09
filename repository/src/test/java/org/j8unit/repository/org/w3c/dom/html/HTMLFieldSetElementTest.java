package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLFieldSetElement;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link HTMLFieldSetElement} (by simply
 * reusing the J8Unit test interface {@link HTMLFieldSetElementTests}).
 */

@RunWith(J8Unit4.class)
public class HTMLFieldSetElementTest
implements HTMLFieldSetElementTests<HTMLFieldSetElement> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.html.HTMLFieldSetElement]

    @Override
    public HTMLFieldSetElement createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.w3c.dom.html.HTMLFieldSetElement], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.w3c.dom.html.HTMLFieldSetElement]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.w3c.dom.html.HTMLFieldSetElement]

}
