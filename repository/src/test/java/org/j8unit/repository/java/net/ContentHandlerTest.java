package org.j8unit.repository.java.net;

import java.net.ContentHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ContentHandler} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.net.ContentHandlerTests}).
 */
@RunWith(J8Unit4.class)
public class ContentHandlerTest
implements ContentHandlerTests<ContentHandler> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.ContentHandler]

    @Override
    public ContentHandler createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.net.ContentHandler], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.net.ContentHandler]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.net.ContentHandler]

}
