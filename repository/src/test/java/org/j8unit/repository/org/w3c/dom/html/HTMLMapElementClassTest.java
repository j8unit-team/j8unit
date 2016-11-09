package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLMapElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLMapElement} (by simply reusing the
 * J8Unit test interface {@link HTMLMapElementClassTests}).
 */

@RunWith(J8Unit4.class)
public class HTMLMapElementClassTest
implements HTMLMapElementClassTests<HTMLMapElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLMapElement]

    @Override
    public Class<HTMLMapElement> createNewSUT() {
        return HTMLMapElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLMapElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLMapElement]

}
