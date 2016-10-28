package org.j8unit.repository.java.net;

import java.net.URLEncoder;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class URLEncoderClassTest
implements org.j8unit.repository.java.net.URLEncoderClassTests<URLEncoder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.URLEncoder]

    @Override
    public Class<URLEncoder> createNewSUT() {
        return URLEncoder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link URLEncoder#encode(String) public static
     * java.lang.String java.net.URLEncoder.encode(java.lang.String)}.
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
    public void test_encode_String()
    throws Exception {
        // write some test for {@link URLEncoder#encode(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link URLEncoder#encode(String, String) public static
     * java.lang.String java.net.URLEncoder.encode(java.lang.String,java.lang.String) throws
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
    public void test_encode_String_String()
    throws Exception {
        // write some test for {@link URLEncoder#encode(String, String)}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.URLEncoder]

}
