package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.xml.sax.DTDHandler;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DTDHandler} (by simply reusing the J8Unit
 * test interface {@link DTDHandlerClassTests}).
 */

@RunWith(J8Unit4.class)
public class DTDHandlerClassTest
implements DTDHandlerClassTests<DTDHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.xml.sax.DTDHandler]

    @Override
    public Class<DTDHandler> createNewSUT() {
        return DTDHandler.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.xml.sax.DTDHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.xml.sax.DTDHandler]

}
