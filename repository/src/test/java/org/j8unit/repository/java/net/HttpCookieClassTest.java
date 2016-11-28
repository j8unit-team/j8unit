package org.j8unit.repository.java.net;

import java.net.HttpCookie;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HttpCookie} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.net.HttpCookieClassTests}).
 */
@RunWith(J8Unit4.class)
public class HttpCookieClassTest
implements HttpCookieClassTests<HttpCookie> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.HttpCookie]

    @Override
    public Class<HttpCookie> createNewSUT() {
        return HttpCookie.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.net.HttpCookie#HttpCookie(String, String)
     * public java.net.HttpCookie(java.lang.String,java.lang.String)}.
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
    public void create_HttpCookie_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final HttpCookie sut = null; // = new HttpCookie(String, String);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.net.HttpCookie#parse(String) public static
     * java.util.List<java.net.HttpCookie> java.net.HttpCookie.parse(java.lang.String)}.
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
    public void test_parse_String()
    throws Exception {
        // write some test for {@link java.net.HttpCookie#parse(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.net.HttpCookie#domainMatches(String, String)
     * public static boolean java.net.HttpCookie.domainMatches(java.lang.String,java.lang.String)}.
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
    public void test_domainMatches_String_String()
    throws Exception {
        // write some test for {@link java.net.HttpCookie#domainMatches(String, String)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.HttpCookie]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.HttpCookie]

}
