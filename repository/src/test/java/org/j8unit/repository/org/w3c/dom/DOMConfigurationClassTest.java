package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.DOMConfiguration;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DOMConfiguration} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.DOMConfigurationClassTests}).
 */
@RunWith(J8Unit4.class)
public class DOMConfigurationClassTest
implements DOMConfigurationClassTests<DOMConfiguration> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.DOMConfiguration]

    @Override
    public Class<DOMConfiguration> createNewSUT() {
        return DOMConfiguration.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.DOMConfiguration]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.DOMConfiguration]

}
