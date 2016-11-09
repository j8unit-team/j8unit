package org.j8unit.repository.org.w3c.dom.ls;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.w3c.dom.ls.LSResourceResolver;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link LSResourceResolver} (by simply
 * reusing the J8Unit test interface {@link LSResourceResolverTests}).
 */

@RunWith(J8Unit4.class)
public class LSResourceResolverTest
implements LSResourceResolverTests<LSResourceResolver> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.ls.LSResourceResolver]

    @Override
    public LSResourceResolver createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.w3c.dom.ls.LSResourceResolver], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.w3c.dom.ls.LSResourceResolver]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.w3c.dom.ls.LSResourceResolver]

}
