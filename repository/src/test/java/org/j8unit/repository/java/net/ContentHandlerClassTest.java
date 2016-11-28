package org.j8unit.repository.java.net;

import static org.junit.Assert.fail;
import java.net.ContentHandler;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ContentHandler} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.net.ContentHandlerClassTests}).
 */
@RunWith(J8Unit4.class)
public class ContentHandlerClassTest
implements ContentHandlerClassTests<ContentHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.ContentHandler]

    @Override
    public Class<ContentHandler> createNewSUT() {
        return ContentHandler.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.net.ContentHandler#ContentHandler() public
     * java.net.ContentHandler()}.
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
    public void create_ContentHandler()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.ContentHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.ContentHandler]

}
