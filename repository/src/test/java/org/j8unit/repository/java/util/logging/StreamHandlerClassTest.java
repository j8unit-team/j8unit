package org.j8unit.repository.java.util.logging;

import java.io.OutputStream;
import java.util.logging.Formatter;
import java.util.logging.StreamHandler;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StreamHandlerClassTest
implements org.j8unit.repository.java.util.logging.StreamHandlerClassTests<StreamHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.logging.StreamHandler]

    @Override
    public Class<StreamHandler> createNewSUT() {
        return StreamHandler.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link StreamHandler#StreamHandler(OutputStream, Formatter) public
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
        final StreamHandler sut = null; // = new StreamHandler(OutputStream, Formatter);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link StreamHandler#StreamHandler() public
     * java.util.logging.StreamHandler()}.
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

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.logging.StreamHandler]

}
