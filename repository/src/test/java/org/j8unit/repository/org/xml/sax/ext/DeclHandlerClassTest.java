package org.j8unit.repository.org.xml.sax.ext;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.xml.sax.ext.DeclHandler;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DeclHandler} (by simply reusing the
 * J8Unit test interface {@link DeclHandlerClassTests}).
 */

@RunWith(J8Unit4.class)
public class DeclHandlerClassTest
implements DeclHandlerClassTests<DeclHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.xml.sax.ext.DeclHandler]

    @Override
    public Class<DeclHandler> createNewSUT() {
        return DeclHandler.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.xml.sax.ext.DeclHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.xml.sax.ext.DeclHandler]

}
