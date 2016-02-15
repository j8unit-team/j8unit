package org.j8unit.repository.javax.print;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.print.URIException interface javax.print.URIException}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link URIExceptionClassTests}.
 * </p>
 *
 * @see javax.print.URIException interface javax.print.URIException (the hereby targeted class-under-test class)
 * @see URIExceptionClassTests URIExceptionClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface URIExceptionTests<SUT extends javax.print.URIException>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.print.URIException#getReason() public abstract int
     * javax.print.URIException.getReason()}.
     *
     * <p>
     * Test method for {@link javax.print.URIException#getReason() public abstract int
     * javax.print.URIException.getReason()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.URIException#getReason() public abstract int javax.print.URIException.getReason() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getReason()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.URIException#getUnsupportedURI() public abstract java.net.URI
     * javax.print.URIException.getUnsupportedURI()}.
     *
     * <p>
     * Test method for {@link javax.print.URIException#getUnsupportedURI() public abstract java.net.URI
     * javax.print.URIException.getUnsupportedURI()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.URIException#getUnsupportedURI() public abstract java.net.URI
     *      javax.print.URIException.getUnsupportedURI() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getUnsupportedURI()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
