package org.j8unit.repository.java.util.logging;

import java.util.logging.SocketHandler;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SocketHandlerClassTest
implements org.j8unit.repository.java.util.logging.SocketHandlerClassTests<SocketHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.logging.SocketHandler]

    @Override
    public Class<SocketHandler> createNewSUT() {
        return SocketHandler.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link SocketHandler#SocketHandler(String, int) public
     * java.util.logging.SocketHandler(java.lang.String,int) throws java.io.IOException}.
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
    public void create_SocketHandler_String_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SocketHandler sut = null; // = new SocketHandler(String, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link SocketHandler#SocketHandler() public
     * java.util.logging.SocketHandler() throws java.io.IOException}.
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
    public void create_SocketHandler()
    throws Exception {
        // create new instance
        final SocketHandler sut = new SocketHandler();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.logging.SocketHandler]

}
