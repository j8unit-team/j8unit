package org.j8unit.repository.java.net;

import java.net.URLDecoder;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link URLDecoder} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.net.URLDecoderClassTests}).
 */

@RunWith(J8Unit4.class)
public class URLDecoderClassTest
implements URLDecoderClassTests<URLDecoder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.URLDecoder]

    @Override
    public Class<URLDecoder> createNewSUT() {
        return URLDecoder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.net.URLDecoder#URLDecoder() public
     * java.net.URLDecoder()}.
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
    public void create_URLDecoder()
    throws Exception {
        // create new instance
        final URLDecoder sut = new URLDecoder();
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.net.URLDecoder#decode(String) public static
     * java.lang.String java.net.URLDecoder.decode(java.lang.String)}.
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
    public void test_decode_String()
    throws Exception {
        // write some test for {@link java.net.URLDecoder#decode(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.net.URLDecoder#decode(String, String) public
     * static java.lang.String java.net.URLDecoder.decode(java.lang.String,java.lang.String) throws
     * java.io.UnsupportedEncodingException}.
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
    public void test_decode_String_String()
    throws Exception {
        // write some test for {@link java.net.URLDecoder#decode(String, String)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.URLDecoder]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.URLDecoder]

}
