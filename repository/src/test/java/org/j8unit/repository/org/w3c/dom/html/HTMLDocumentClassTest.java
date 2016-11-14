package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLDocument;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLDocument} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.html.HTMLDocumentClassTests}).
 */

@RunWith(J8Unit4.class)
public class HTMLDocumentClassTest
implements HTMLDocumentClassTests<HTMLDocument> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLDocument]

    @Override
    public Class<HTMLDocument> createNewSUT() {
        return HTMLDocument.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLDocument]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLDocument]

}
