package org.j8unit.repository.java.net;

import java.net.HttpURLConnection;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HttpURLConnection} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.net.HttpURLConnectionClassTests}).
 */
@RunWith(J8Unit4.class)
public class HttpURLConnectionClassTest
implements HttpURLConnectionClassTests<HttpURLConnection> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.HttpURLConnection]

    @Override
    public Class<HttpURLConnection> createNewSUT() {
        return HttpURLConnection.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.net.HttpURLConnection#getFollowRedirects()
     * public static boolean java.net.HttpURLConnection.getFollowRedirects()}.
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
    public void test_getFollowRedirects()
    throws Exception {
        // write some test for {@link java.net.HttpURLConnection#getFollowRedirects()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.net.HttpURLConnection#setFollowRedirects(boolean) public static void
     * java.net.HttpURLConnection.setFollowRedirects(boolean)}.
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
    public void test_setFollowRedirects_boolean()
    throws Exception {
        // write some test for {@link java.net.HttpURLConnection#setFollowRedirects(boolean)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.HttpURLConnection]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.HttpURLConnection]

}
