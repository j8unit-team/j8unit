package org.j8unit.repository.java.net;

import static org.junit.Assert.fail;
import java.net.CookieHandler;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CookieHandlerClassTest
implements org.j8unit.repository.java.net.CookieHandlerClassTests<CookieHandler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.CookieHandler]

    @Override
    public Class<CookieHandler> createNewSUT() {
        return CookieHandler.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.net.CookieHandler#CookieHandler() public
     * java.net.CookieHandler()}.
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
    public void create_CookieHandler()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.net.CookieHandler#setDefault(java.net.CookieHandler) public static synchronized void
     * java.net.CookieHandler.setDefault(java.net.CookieHandler)}.
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
    public void test_setDefault_CookieHandler()
    throws Exception {
        // write some test for {@link java.net.CookieHandler#setDefault(java.net.CookieHandler)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.net.CookieHandler#getDefault() public static
     * synchronized java.net.CookieHandler java.net.CookieHandler.getDefault()}.
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
    public void test_getDefault()
    throws Exception {
        // write some test for {@link java.net.CookieHandler#getDefault()}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.CookieHandler]

}
