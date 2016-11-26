package org.j8unit.repository.java.util.logging;

import java.util.logging.Logger;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Logger} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.util.logging.LoggerClassTests}).
 */
@RunWith(J8Unit4.class)
public class LoggerClassTest
implements LoggerClassTests<Logger> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.logging.Logger]

    @Override
    public Class<Logger> createNewSUT() {
        return Logger.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.logging.Logger#getGlobal() public static
     * final java.util.logging.Logger java.util.logging.Logger.getGlobal()}.
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
    public void test_getGlobal()
    throws Exception {
        // write some test for {@link java.util.logging.Logger#getGlobal()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.logging.Logger#getLogger(String) public
     * static java.util.logging.Logger java.util.logging.Logger.getLogger(java.lang.String)}.
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
    public void test_getLogger_String()
    throws Exception {
        // write some test for {@link java.util.logging.Logger#getLogger(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.logging.Logger#getLogger(String, String)
     * public static java.util.logging.Logger java.util.logging.Logger.getLogger(java.lang.String,java.lang.String)}.
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
    public void test_getLogger_String_String()
    throws Exception {
        // write some test for {@link java.util.logging.Logger#getLogger(String, String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.logging.Logger#getAnonymousLogger() public
     * static java.util.logging.Logger java.util.logging.Logger.getAnonymousLogger()}.
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
    public void test_getAnonymousLogger()
    throws Exception {
        // write some test for {@link java.util.logging.Logger#getAnonymousLogger()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.logging.Logger#getAnonymousLogger(String)
     * public static java.util.logging.Logger java.util.logging.Logger.getAnonymousLogger(java.lang.String)}.
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
    public void test_getAnonymousLogger_String()
    throws Exception {
        // write some test for {@link java.util.logging.Logger#getAnonymousLogger(String)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.logging.Logger]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.logging.Logger]

}
