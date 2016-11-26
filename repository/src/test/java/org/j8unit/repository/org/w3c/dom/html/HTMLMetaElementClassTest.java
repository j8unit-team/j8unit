package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLMetaElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLMetaElement} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.html.HTMLMetaElementClassTests}).
 */
@RunWith(J8Unit4.class)
public class HTMLMetaElementClassTest
implements HTMLMetaElementClassTests<HTMLMetaElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLMetaElement]

    @Override
    public Class<HTMLMetaElement> createNewSUT() {
        return HTMLMetaElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLMetaElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLMetaElement]

}
