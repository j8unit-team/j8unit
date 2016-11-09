package org.j8unit.repository.org.w3c.dom.ls;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.ls.LSResourceResolver;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LSResourceResolver} (by simply reusing
 * the J8Unit test interface {@link LSResourceResolverClassTests}).
 */

@RunWith(J8Unit4.class)
public class LSResourceResolverClassTest
implements LSResourceResolverClassTests<LSResourceResolver> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.ls.LSResourceResolver]

    @Override
    public Class<LSResourceResolver> createNewSUT() {
        return LSResourceResolver.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.ls.LSResourceResolver]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.ls.LSResourceResolver]

}
