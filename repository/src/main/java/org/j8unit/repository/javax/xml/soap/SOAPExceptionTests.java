package org.j8unit.repository.javax.xml.soap;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.soap.SOAPException class javax.xml.soap.SOAPException}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link SOAPExceptionClassTests}.
 * </p>
 *
 * @see javax.xml.soap.SOAPException class javax.xml.soap.SOAPException (the hereby targeted class-under-test class)
 * @see SOAPExceptionClassTests SOAPExceptionClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SOAPExceptionTests<SUT extends javax.xml.soap.SOAPException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.soap.SOAPException#getCause() public java.lang.Throwable
     * javax.xml.soap.SOAPException.getCause()}.
     *
     * <p>
     * Test method for {@link javax.xml.soap.SOAPException#getCause() public java.lang.Throwable
     * javax.xml.soap.SOAPException.getCause()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.soap.SOAPException#getCause() public java.lang.Throwable javax.xml.soap.SOAPException.getCause()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getCause()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.soap.SOAPException#getMessage() public java.lang.String
     * javax.xml.soap.SOAPException.getMessage()}.
     *
     * <p>
     * Test method for {@link javax.xml.soap.SOAPException#getMessage() public java.lang.String
     * javax.xml.soap.SOAPException.getMessage()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.soap.SOAPException#getMessage() public java.lang.String javax.xml.soap.SOAPException.getMessage()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getMessage()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.soap.SOAPException#initCause(Throwable) public synchronized java.lang.Throwable
     * javax.xml.soap.SOAPException.initCause(java.lang.Throwable)}.
     *
     * <p>
     * Test method for {@link javax.xml.soap.SOAPException#initCause(Throwable) public synchronized java.lang.Throwable
     * javax.xml.soap.SOAPException.initCause(java.lang.Throwable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.soap.SOAPException#initCause(Throwable) public synchronized java.lang.Throwable
     *      javax.xml.soap.SOAPException.initCause(java.lang.Throwable) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_initCause_Throwable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
