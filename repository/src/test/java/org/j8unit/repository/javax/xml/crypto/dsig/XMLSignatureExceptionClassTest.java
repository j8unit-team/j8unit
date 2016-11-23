package org.j8unit.repository.javax.xml.crypto.dsig;

import javax.xml.crypto.dsig.XMLSignatureException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XMLSignatureException} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.crypto.dsig.XMLSignatureExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class XMLSignatureExceptionClassTest
implements XMLSignatureExceptionClassTests<XMLSignatureException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.XMLSignatureException]

    @Override
    public Class<XMLSignatureException> createNewSUT() {
        return XMLSignatureException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.crypto.dsig.XMLSignatureException#XMLSignatureException(Throwable) public
     * javax.xml.crypto.dsig.XMLSignatureException(java.lang.Throwable)}.
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
    public void create_XMLSignatureException_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final XMLSignatureException sut = null; // = new XMLSignatureException(Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.crypto.dsig.XMLSignatureException#XMLSignatureException(String, Throwable) public
     * javax.xml.crypto.dsig.XMLSignatureException(java.lang.String,java.lang.Throwable)}.
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
    public void create_XMLSignatureException_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final XMLSignatureException sut = null; // = new XMLSignatureException(String, Throwable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.crypto.dsig.XMLSignatureException#XMLSignatureException(String) public
     * javax.xml.crypto.dsig.XMLSignatureException(java.lang.String)}.
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
    public void create_XMLSignatureException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final XMLSignatureException sut = null; // = new XMLSignatureException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.crypto.dsig.XMLSignatureException#XMLSignatureException() public
     * javax.xml.crypto.dsig.XMLSignatureException()}.
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
    public void create_XMLSignatureException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final XMLSignatureException sut = new XMLSignatureException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.dsig.XMLSignatureException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.XMLSignatureException]

}
