package org.j8unit.repository.java.net;

import static org.junit.Assert.fail;
import java.net.URLStreamHandler;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link URLStreamHandler} (by simply reusing the
 * J8Unit test interface {@link URLStreamHandlerClassTests}).
 */

@RunWith(J8Unit4.class)
public class URLStreamHandlerClassTest
implements URLStreamHandlerClassTests<URLStreamHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.URLStreamHandler]

    @Override
    public Class<URLStreamHandler> createNewSUT() {
        return URLStreamHandler.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.net.URLStreamHandler#URLStreamHandler()
     * public java.net.URLStreamHandler()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_URLStreamHandler()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.URLStreamHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.URLStreamHandler]

}
