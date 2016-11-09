package org.j8unit.repository.java.net;

import java.net.ContentHandlerFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ContentHandlerFactory} (by simply
 * reusing the J8Unit test interface {@link ContentHandlerFactoryTests}).
 */

@RunWith(J8Unit4.class)
public class ContentHandlerFactoryTest
implements ContentHandlerFactoryTests<ContentHandlerFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.ContentHandlerFactory]

    @Override
    public ContentHandlerFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.net.ContentHandlerFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.net.ContentHandlerFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.net.ContentHandlerFactory]

}
