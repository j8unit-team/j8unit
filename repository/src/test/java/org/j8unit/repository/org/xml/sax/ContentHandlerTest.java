package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.xml.sax.ContentHandler;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ContentHandler} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.xml.sax.ContentHandlerTests}).
 */

@RunWith(J8Unit4.class)
public class ContentHandlerTest
implements ContentHandlerTests<ContentHandler> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.xml.sax.ContentHandler]

    @Override
    public ContentHandler createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.xml.sax.ContentHandler], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.xml.sax.ContentHandler]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.xml.sax.ContentHandler]

}
