package org.j8unit.repository.javax.activation;

import javax.activation.MimeTypeParseException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MimeTypeParseException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.activation.MimeTypeParseExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class MimeTypeParseExceptionClassTest
implements MimeTypeParseExceptionClassTests<MimeTypeParseException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.activation.MimeTypeParseException]

    @Override
    public Class<MimeTypeParseException> createNewSUT() {
        return MimeTypeParseException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.activation.MimeTypeParseException#MimeTypeParseException() public
     * javax.activation.MimeTypeParseException()}.
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
    public void create_MimeTypeParseException()
    throws Exception {
        // create new instance
        final MimeTypeParseException sut = new MimeTypeParseException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.activation.MimeTypeParseException#MimeTypeParseException(String) public
     * javax.activation.MimeTypeParseException(java.lang.String)}.
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
    public void create_MimeTypeParseException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MimeTypeParseException sut = null; // = new MimeTypeParseException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.activation.MimeTypeParseException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.activation.MimeTypeParseException]

}
