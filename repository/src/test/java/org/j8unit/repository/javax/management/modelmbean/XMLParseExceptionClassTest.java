package org.j8unit.repository.javax.management.modelmbean;

import javax.management.modelmbean.XMLParseException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XMLParseException} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.management.modelmbean.XMLParseExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class XMLParseExceptionClassTest
implements XMLParseExceptionClassTests<XMLParseException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.modelmbean.XMLParseException]

    @Override
    public Class<XMLParseException> createNewSUT() {
        return XMLParseException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.modelmbean.XMLParseException#XMLParseException(Exception, String) public
     * javax.management.modelmbean.XMLParseException(java.lang.Exception,java.lang.String)}.
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
    public void create_XMLParseException_Exception_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final XMLParseException sut = null; // = new XMLParseException(Exception, String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.modelmbean.XMLParseException#XMLParseException(String) public
     * javax.management.modelmbean.XMLParseException(java.lang.String)}.
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
    public void create_XMLParseException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final XMLParseException sut = null; // = new XMLParseException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.modelmbean.XMLParseException#XMLParseException() public
     * javax.management.modelmbean.XMLParseException()}.
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
    public void create_XMLParseException()
    throws Exception {
        // create new instance
        final XMLParseException sut = new XMLParseException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.modelmbean.XMLParseException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.modelmbean.XMLParseException]

}
