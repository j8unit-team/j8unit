package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLCollection;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLCollection} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.html.HTMLCollectionClassTests}).
 */

@RunWith(J8Unit4.class)
public class HTMLCollectionClassTest
implements HTMLCollectionClassTests<HTMLCollection> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLCollection]

    @Override
    public Class<HTMLCollection> createNewSUT() {
        return HTMLCollection.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLCollection]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLCollection]

}
