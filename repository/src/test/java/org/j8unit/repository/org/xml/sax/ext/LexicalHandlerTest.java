package org.j8unit.repository.org.xml.sax.ext;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.xml.sax.ext.LexicalHandler;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link LexicalHandler} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.xml.sax.ext.LexicalHandlerTests}).
 */

@RunWith(J8Unit4.class)
public class LexicalHandlerTest
implements LexicalHandlerTests<LexicalHandler> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.xml.sax.ext.LexicalHandler]

    @Override
    public LexicalHandler createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.xml.sax.ext.LexicalHandler], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.xml.sax.ext.LexicalHandler]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.xml.sax.ext.LexicalHandler]

}
