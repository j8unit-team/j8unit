package org.j8unit.repository.java.nio.charset;

import java.nio.charset.UnsupportedCharsetException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link UnsupportedCharsetException} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.java.nio.charset.UnsupportedCharsetExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class UnsupportedCharsetExceptionClassTest
implements UnsupportedCharsetExceptionClassTests<UnsupportedCharsetException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.charset.UnsupportedCharsetException]

    @Override
    public Class<UnsupportedCharsetException> createNewSUT() {
        return UnsupportedCharsetException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.nio.charset.UnsupportedCharsetException#UnsupportedCharsetException(String) public
     * java.nio.charset.UnsupportedCharsetException(java.lang.String)}.
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
    public void create_UnsupportedCharsetException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UnsupportedCharsetException sut = null; // = new UnsupportedCharsetException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.charset.UnsupportedCharsetException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.charset.UnsupportedCharsetException]

}
