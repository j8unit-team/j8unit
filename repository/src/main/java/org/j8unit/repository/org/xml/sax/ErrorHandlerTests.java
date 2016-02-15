package org.j8unit.repository.org.xml.sax;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.xml.sax.ErrorHandler interface org.xml.sax.ErrorHandler}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ErrorHandlerClassTests}.
 * </p>
 *
 * @see org.xml.sax.ErrorHandler interface org.xml.sax.ErrorHandler (the hereby targeted class-under-test class)
 * @see ErrorHandlerClassTests ErrorHandlerClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ErrorHandlerTests<SUT extends org.xml.sax.ErrorHandler>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.xml.sax.ErrorHandler#fatalError(org.xml.sax.SAXParseException) public abstract void
     * org.xml.sax.ErrorHandler.fatalError(org.xml.sax.SAXParseException) throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.ErrorHandler#fatalError(org.xml.sax.SAXParseException) public abstract void
     * org.xml.sax.ErrorHandler.fatalError(org.xml.sax.SAXParseException) throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.ErrorHandler#fatalError(org.xml.sax.SAXParseException) public abstract void
     *      org.xml.sax.ErrorHandler.fatalError(org.xml.sax.SAXParseException) throws org.xml.sax.SAXException (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_fatalError_SAXParseException()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.ErrorHandler#warning(org.xml.sax.SAXParseException) public abstract void
     * org.xml.sax.ErrorHandler.warning(org.xml.sax.SAXParseException) throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.ErrorHandler#warning(org.xml.sax.SAXParseException) public abstract void
     * org.xml.sax.ErrorHandler.warning(org.xml.sax.SAXParseException) throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.ErrorHandler#warning(org.xml.sax.SAXParseException) public abstract void
     *      org.xml.sax.ErrorHandler.warning(org.xml.sax.SAXParseException) throws org.xml.sax.SAXException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_warning_SAXParseException()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.xml.sax.ErrorHandler#error(org.xml.sax.SAXParseException) public abstract void
     * org.xml.sax.ErrorHandler.error(org.xml.sax.SAXParseException) throws org.xml.sax.SAXException}.
     *
     * <p>
     * Test method for {@link org.xml.sax.ErrorHandler#error(org.xml.sax.SAXParseException) public abstract void
     * org.xml.sax.ErrorHandler.error(org.xml.sax.SAXParseException) throws org.xml.sax.SAXException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.xml.sax.ErrorHandler#error(org.xml.sax.SAXParseException) public abstract void
     *      org.xml.sax.ErrorHandler.error(org.xml.sax.SAXParseException) throws org.xml.sax.SAXException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_error_SAXParseException()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
