package org.j8unit.repository.org.xml.sax;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.xml.sax.SAXNotSupportedException;

@RunWith(J8Unit4.class)
public class SAXNotSupportedExceptionClassTest
implements org.j8unit.repository.org.xml.sax.SAXNotSupportedExceptionClassTests<SAXNotSupportedException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.xml.sax.SAXNotSupportedException]

    @Override
    public Class<SAXNotSupportedException> createNewSUT() {
        return SAXNotSupportedException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.xml.sax.SAXNotSupportedException#SAXNotSupportedException() public
     * org.xml.sax.SAXNotSupportedException()}.
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
    public void create_SAXNotSupportedException()
    throws Exception {
        // create new instance
        final SAXNotSupportedException sut = new SAXNotSupportedException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.xml.sax.SAXNotSupportedException#SAXNotSupportedException(String) public
     * org.xml.sax.SAXNotSupportedException(java.lang.String)}.
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
    public void create_SAXNotSupportedException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SAXNotSupportedException sut = null; // = new SAXNotSupportedException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.xml.sax.SAXNotSupportedException]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.xml.sax.SAXNotSupportedException]

}
