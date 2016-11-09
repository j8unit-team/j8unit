package org.j8unit.repository.java.net;

import java.net.URI;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link URI} (by simply reusing the J8Unit test
 * interface {@link URIClassTests}).
 */

@RunWith(J8Unit4.class)
public class URIClassTest
implements URIClassTests<URI> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.URI]

    @Override
    public Class<URI> createNewSUT() {
        return URI.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.net.URI#URI(String) public
     * java.net.URI(java.lang.String) throws java.net.URISyntaxException}.
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
    public void create_URI_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final URI sut = null; // = new URI(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.net.URI#URI(String, String, String, int, String, String, String) public
     * java.net.URI(java.lang.String,java.lang.String,java.lang.String,int,java.lang.String,java.lang.String,java.lang.String)
     * throws java.net.URISyntaxException}.
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
    public void create_URI_String_String_String_int_String_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final URI sut = null; // = new URI(String, String, String, int, String, String, String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.net.URI#URI(String, String, String, String, String) public
     * java.net.URI(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String) throws
     * java.net.URISyntaxException}.
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
    public void create_URI_String_String_String_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final URI sut = null; // = new URI(String, String, String, String, String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.net.URI#URI(String, String, String) public
     * java.net.URI(java.lang.String,java.lang.String,java.lang.String) throws java.net.URISyntaxException}.
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
    public void create_URI_String_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final URI sut = null; // = new URI(String, String, String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.net.URI#URI(String, String, String, String) public
     * java.net.URI(java.lang.String,java.lang.String,java.lang.String,java.lang.String) throws
     * java.net.URISyntaxException}.
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
    public void create_URI_String_String_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final URI sut = null; // = new URI(String, String, String, String);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.net.URI#create(String) public static
     * java.net.URI java.net.URI.create(java.lang.String)}.
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
    public void test_create_String()
    throws Exception {
        // write some test for {@link java.net.URI#create(String)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.URI]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.URI]

}
