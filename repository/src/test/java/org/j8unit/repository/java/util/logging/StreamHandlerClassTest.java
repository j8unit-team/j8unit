package org.j8unit.repository.java.util.logging;

import java.util.logging.StreamHandler;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link StreamHandler} (by simply reusing the
 * J8Unit test interface {@link StreamHandlerClassTests}).
 */

@RunWith(J8Unit4.class)
public class StreamHandlerClassTest
implements StreamHandlerClassTests<StreamHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.logging.StreamHandler]

    @Override
    public Class<StreamHandler> createNewSUT() {
        return StreamHandler.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.logging.StreamHandler#StreamHandler(java.io.OutputStream, java.util.logging.Formatter) public
     * java.util.logging.StreamHandler(java.io.OutputStream,java.util.logging.Formatter)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_StreamHandler_OutputStream_Formatter()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final StreamHandler sut = null; // = new StreamHandler(java.io.OutputStream, java.util.logging.Formatter);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.logging.StreamHandler#StreamHandler()
     * public java.util.logging.StreamHandler()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_StreamHandler()
    throws Exception {
        // create new instance
        final StreamHandler sut = new StreamHandler();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.logging.StreamHandler]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.logging.StreamHandler]

}
