package org.j8unit.repository.org.w3c.dom.views;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.w3c.dom.views.DocumentView;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DocumentView} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.views.DocumentViewTests}).
 */

@RunWith(J8Unit4.class)
public class DocumentViewTest
implements DocumentViewTests<DocumentView> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.views.DocumentView]

    @Override
    public DocumentView createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.w3c.dom.views.DocumentView], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.w3c.dom.views.DocumentView]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.w3c.dom.views.DocumentView]

}
