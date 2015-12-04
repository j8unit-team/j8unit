package org.j8unit.repository.java.awt.print;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.print.PrinterIOException class java.awt.print.PrinterIOException}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.print.PrinterIOExceptionClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PrinterIOExceptionTests<SUT extends java.awt.print.PrinterIOException>
extends org.j8unit.repository.java.awt.print.PrinterExceptionTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.print.PrinterIOException#getCause() public java.lang.Throwable
     * java.awt.print.PrinterIOException.getCause()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
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
     * </p>
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
