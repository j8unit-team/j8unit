package org.j8unit.repository.java.awt.print;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.print.PrinterIOException class java.awt.print.PrinterIOException}
 * . The complementary j8unit test interface containing the class relevant aspects is
 * {@link PrinterIOExceptionClassTests}.
 * </p>
 *
 * @see java.awt.print.PrinterIOException class java.awt.print.PrinterIOException (the hereby targeted class-under-test
 *      class)
 * @see PrinterIOExceptionClassTests PrinterIOExceptionClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PrinterIOExceptionTests<SUT extends java.awt.print.PrinterIOException>
extends PrinterExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.print.PrinterIOException#getCause() public java.lang.Throwable
     * java.awt.print.PrinterIOException.getCause()}.
     *
     * <p>
     * Test method for {@link java.awt.print.PrinterIOException#getCause() public java.lang.Throwable
     * java.awt.print.PrinterIOException.getCause()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.print.PrinterIOException#getCause() public java.lang.Throwable
     *      java.awt.print.PrinterIOException.getCause() (the hereby targeted method-under-test)
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
     * Test method for {@link java.awt.print.PrinterIOException#getIOException() public java.io.IOException
     * java.awt.print.PrinterIOException.getIOException()}.
     *
     * <p>
     * Test method for {@link java.awt.print.PrinterIOException#getIOException() public java.io.IOException
     * java.awt.print.PrinterIOException.getIOException()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.print.PrinterIOException#getIOException() public java.io.IOException
     *      java.awt.print.PrinterIOException.getIOException() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getIOException()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
