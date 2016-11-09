package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.xml.sax.DocumentHandler;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DocumentHandler} (by simply reusing
 * the J8Unit test interface {@link DocumentHandlerTests}).
 */

@RunWith(J8Unit4.class)
public class DocumentHandlerTest
implements DocumentHandlerTests<DocumentHandler> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.xml.sax.DocumentHandler]

    @Override
    public DocumentHandler createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.xml.sax.DocumentHandler], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.xml.sax.DocumentHandler]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.xml.sax.DocumentHandler]

}
