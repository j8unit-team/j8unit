package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.CDATASection;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CDATASection} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.CDATASectionClassTests}).
 */
@RunWith(J8Unit4.class)
public class CDATASectionClassTest
implements CDATASectionClassTests<CDATASection> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.CDATASection]

    @Override
    public Class<CDATASection> createNewSUT() {
        return CDATASection.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.CDATASection]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.CDATASection]

}
