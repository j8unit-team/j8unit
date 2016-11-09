package org.j8unit.repository.org.w3c.dom.views;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.views.DocumentView;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DocumentView} (by simply reusing the
 * J8Unit test interface {@link DocumentViewClassTests}).
 */

@RunWith(J8Unit4.class)
public class DocumentViewClassTest
implements DocumentViewClassTests<DocumentView> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.views.DocumentView]

    @Override
    public Class<DocumentView> createNewSUT() {
        return DocumentView.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.views.DocumentView]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.views.DocumentView]

}
