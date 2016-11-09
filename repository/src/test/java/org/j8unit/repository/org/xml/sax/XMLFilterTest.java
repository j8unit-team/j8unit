package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.xml.sax.XMLFilter;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link XMLFilter} (by simply reusing the
 * J8Unit test interface {@link XMLFilterTests}).
 */

@RunWith(J8Unit4.class)
public class XMLFilterTest
implements XMLFilterTests<XMLFilter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.xml.sax.XMLFilter]

    @Override
    public XMLFilter createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.xml.sax.XMLFilter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.xml.sax.XMLFilter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.xml.sax.XMLFilter]

}
