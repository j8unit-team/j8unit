package org.j8unit.repository.org.xml.sax;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.xml.sax.SAXException class org.xml.sax.SAXException}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link SAXExceptionClassTests}.
 * </p>
 *
 * @see org.xml.sax.SAXException class org.xml.sax.SAXException (the hereby targeted class-under-test class)
 * @see SAXExceptionClassTests SAXExceptionClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SAXExceptionTests<SUT extends org.xml.sax.SAXException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.xml.sax.SAXException#getException() public java.lang.Exception
     * org.xml.sax.SAXException.getException()}.
     *
     * <p>
     * Test method for {@link org.xml.sax.SAXException#getException() public java.lang.Exception
     * org.xml.sax.SAXException.getException()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.SAXException#getException() public java.lang.Exception org.xml.sax.SAXException.getException()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getException()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.SAXException#getCause() public java.lang.Throwable
     * org.xml.sax.SAXException.getCause()}.
     *
     * <p>
     * Test method for {@link org.xml.sax.SAXException#getCause() public java.lang.Throwable
     * org.xml.sax.SAXException.getCause()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.SAXException#getCause() public java.lang.Throwable org.xml.sax.SAXException.getCause() (the
     *      hereby targeted method-under-test)
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
     * Test method for {@link org.xml.sax.SAXException#toString() public java.lang.String
     * org.xml.sax.SAXException.toString()}.
     *
     * <p>
     * Test method for {@link org.xml.sax.SAXException#toString() public java.lang.String
     * org.xml.sax.SAXException.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.SAXException#toString() public java.lang.String org.xml.sax.SAXException.toString() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.SAXException#getMessage() public java.lang.String
     * org.xml.sax.SAXException.getMessage()}.
     *
     * <p>
     * Test method for {@link org.xml.sax.SAXException#getMessage() public java.lang.String
     * org.xml.sax.SAXException.getMessage()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.SAXException#getMessage() public java.lang.String org.xml.sax.SAXException.getMessage() (the
     *      hereby targeted method-under-test)
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

}
