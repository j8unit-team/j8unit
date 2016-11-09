package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.xml.sax.DTDHandler;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DTDHandler} (by simply reusing the
 * J8Unit test interface {@link DTDHandlerTests}).
 */

@RunWith(J8Unit4.class)
public class DTDHandlerTest
implements DTDHandlerTests<DTDHandler> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.xml.sax.DTDHandler]

    @Override
    public DTDHandler createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.xml.sax.DTDHandler], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.xml.sax.DTDHandler]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.xml.sax.DTDHandler]

}
