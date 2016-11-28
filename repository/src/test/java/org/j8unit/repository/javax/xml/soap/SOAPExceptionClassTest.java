package org.j8unit.repository.javax.xml.soap;

import javax.xml.soap.SOAPException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SOAPException} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.soap.SOAPExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class SOAPExceptionClassTest
implements SOAPExceptionClassTests<SOAPException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.soap.SOAPException]

    @Override
    public Class<SOAPException> createNewSUT() {
        return SOAPException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.soap.SOAPException#SOAPException(Throwable) public
     * javax.xml.soap.SOAPException(java.lang.Throwable)}.
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
    public void create_SOAPException_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SOAPException sut = null; // = new SOAPException(Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.soap.SOAPException#SOAPException(String, Throwable) public
     * javax.xml.soap.SOAPException(java.lang.String,java.lang.Throwable)}.
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
    public void create_SOAPException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SOAPException sut = null; // = new SOAPException(String, Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.soap.SOAPException#SOAPException(String) public javax.xml.soap.SOAPException(java.lang.String)}.
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
    public void create_SOAPException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SOAPException sut = null; // = new SOAPException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.xml.soap.SOAPException#SOAPException()
     * public javax.xml.soap.SOAPException()}.
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
    public void create_SOAPException()
    throws Exception {
        // create new instance

        @SuppressWarnings("unused")
        final SOAPException sut = new SOAPException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.soap.SOAPException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.soap.SOAPException]

}
