package org.j8unit.repository.org.xml.sax;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.xml.sax.SAXNotRecognizedException;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SAXNotRecognizedException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.org.xml.sax.SAXNotRecognizedExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class SAXNotRecognizedExceptionClassTest
implements SAXNotRecognizedExceptionClassTests<SAXNotRecognizedException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.xml.sax.SAXNotRecognizedException]

    @Override
    public Class<SAXNotRecognizedException> createNewSUT() {
        return SAXNotRecognizedException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.xml.sax.SAXNotRecognizedException#SAXNotRecognizedException() public
     * org.xml.sax.SAXNotRecognizedException()}.
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
    public void create_SAXNotRecognizedException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SAXNotRecognizedException sut = new SAXNotRecognizedException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.xml.sax.SAXNotRecognizedException#SAXNotRecognizedException(String) public
     * org.xml.sax.SAXNotRecognizedException(java.lang.String)}.
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
    public void create_SAXNotRecognizedException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SAXNotRecognizedException sut = null; // = new SAXNotRecognizedException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.xml.sax.SAXNotRecognizedException]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.xml.sax.SAXNotRecognizedException]

}
