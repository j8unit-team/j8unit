package org.j8unit.repository.org.xml.sax.ext;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.xml.sax.ext.LexicalHandler;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LexicalHandler} (by simply reusing the
 * J8Unit test interface {@link LexicalHandlerClassTests}).
 */

@RunWith(J8Unit4.class)
public class LexicalHandlerClassTest
implements LexicalHandlerClassTests<LexicalHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.xml.sax.ext.LexicalHandler]

    @Override
    public Class<LexicalHandler> createNewSUT() {
        return LexicalHandler.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.xml.sax.ext.LexicalHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.xml.sax.ext.LexicalHandler]

}
