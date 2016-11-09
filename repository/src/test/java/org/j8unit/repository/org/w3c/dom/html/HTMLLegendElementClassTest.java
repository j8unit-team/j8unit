package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.html.HTMLLegendElement;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTMLLegendElement} (by simply reusing the
 * J8Unit test interface {@link HTMLLegendElementClassTests}).
 */

@RunWith(J8Unit4.class)
public class HTMLLegendElementClassTest
implements HTMLLegendElementClassTests<HTMLLegendElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.html.HTMLLegendElement]

    @Override
    public Class<HTMLLegendElement> createNewSUT() {
        return HTMLLegendElement.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.html.HTMLLegendElement]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.html.HTMLLegendElement]

}
