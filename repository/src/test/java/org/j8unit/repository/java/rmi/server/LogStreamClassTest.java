package org.j8unit.repository.java.rmi.server;

import java.rmi.server.LogStream;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LogStream} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.rmi.server.LogStreamClassTests}).
 */
@RunWith(J8Unit4.class)
@SuppressWarnings("deprecation")
public class LogStreamClassTest
implements LogStreamClassTests<LogStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.server.LogStream]

    @Override
    public Class<LogStream> createNewSUT() {
        return LogStream.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.rmi.server.LogStream#getDefaultStream() public
     * static synchronized java.io.PrintStream java.rmi.server.LogStream.getDefaultStream()}.
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
    public void test_getDefaultStream()
    throws Exception {
        // write some test for {@link java.rmi.server.LogStream#getDefaultStream()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.rmi.server.LogStream#log(String) public static
     * java.rmi.server.LogStream java.rmi.server.LogStream.log(java.lang.String)}.
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
    public void test_log_String()
    throws Exception {
        // write some test for {@link java.rmi.server.LogStream#log(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.rmi.server.LogStream#parseLevel(String) public
     * static int java.rmi.server.LogStream.parseLevel(java.lang.String)}.
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
    public void test_parseLevel_String()
    throws Exception {
        // write some test for {@link java.rmi.server.LogStream#parseLevel(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.rmi.server.LogStream#setDefaultStream(java.io.PrintStream) public static synchronized void
     * java.rmi.server.LogStream.setDefaultStream(java.io.PrintStream)}.
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
    public void test_setDefaultStream_PrintStream()
    throws Exception {
        // write some test for {@link java.rmi.server.LogStream#setDefaultStream(java.io.PrintStream)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.rmi.server.LogStream]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.server.LogStream]

}
