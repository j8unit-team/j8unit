package org.j8unit.repository.javax.xml.parsers;

import javax.xml.parsers.ParserConfigurationException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ParserConfigurationException} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.xml.parsers.ParserConfigurationExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class ParserConfigurationExceptionClassTest
implements ParserConfigurationExceptionClassTests<ParserConfigurationException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.parsers.ParserConfigurationException]

    @Override
    public Class<ParserConfigurationException> createNewSUT() {
        return ParserConfigurationException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.parsers.ParserConfigurationException#ParserConfigurationException() public
     * javax.xml.parsers.ParserConfigurationException()}.
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
    public void create_ParserConfigurationException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ParserConfigurationException sut = new ParserConfigurationException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.parsers.ParserConfigurationException#ParserConfigurationException(String) public
     * javax.xml.parsers.ParserConfigurationException(java.lang.String)}.
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
    public void create_ParserConfigurationException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ParserConfigurationException sut = null; // = new ParserConfigurationException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.parsers.ParserConfigurationException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.parsers.ParserConfigurationException]

}
