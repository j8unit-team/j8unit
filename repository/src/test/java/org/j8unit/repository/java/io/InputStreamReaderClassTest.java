package org.j8unit.repository.java.io;

import java.io.InputStreamReader;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link InputStreamReader} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.io.InputStreamReaderClassTests}).
 */

@RunWith(J8Unit4.class)
public class InputStreamReaderClassTest
implements InputStreamReaderClassTests<InputStreamReader> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.InputStreamReader]

    @Override
    public Class<InputStreamReader> createNewSUT() {
        return InputStreamReader.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.InputStreamReader#InputStreamReader(java.io.InputStream, java.nio.charset.CharsetDecoder) public
     * java.io.InputStreamReader(java.io.InputStream,java.nio.charset.CharsetDecoder)}.
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
    public void create_InputStreamReader_InputStream_CharsetDecoder()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InputStreamReader sut = null; // = new InputStreamReader(java.io.InputStream,
                                            // java.nio.charset.CharsetDecoder);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.InputStreamReader#InputStreamReader(java.io.InputStream, java.nio.charset.Charset) public
     * java.io.InputStreamReader(java.io.InputStream,java.nio.charset.Charset)}.
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
    public void create_InputStreamReader_InputStream_Charset()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InputStreamReader sut = null; // = new InputStreamReader(java.io.InputStream, java.nio.charset.Charset);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.InputStreamReader#InputStreamReader(java.io.InputStream, String) public
     * java.io.InputStreamReader(java.io.InputStream,java.lang.String) throws java.io.UnsupportedEncodingException}.
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
    public void create_InputStreamReader_InputStream_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InputStreamReader sut = null; // = new InputStreamReader(java.io.InputStream, String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.InputStreamReader#InputStreamReader(java.io.InputStream) public
     * java.io.InputStreamReader(java.io.InputStream)}.
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
    public void create_InputStreamReader_InputStream()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final InputStreamReader sut = null; // = new InputStreamReader(java.io.InputStream);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.InputStreamReader]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.InputStreamReader]

}
