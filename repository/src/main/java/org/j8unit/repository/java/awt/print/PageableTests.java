package org.j8unit.repository.java.awt.print;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.print.Pageable interface java.awt.print.Pageable}, containing all instance relevant
 * test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.print.PageableClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface PageableTests<SUT extends java.awt.print.Pageable>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.print.Pageable#getPageFormat(int) public abstract java.awt.print.PageFormat
     * java.awt.print.Pageable.getPageFormat(int) throws java.lang.IndexOutOfBoundsException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPageFormat_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.print.Pageable#getPrintable(int) public abstract java.awt.print.Printable
     * java.awt.print.Pageable.getPrintable(int) throws java.lang.IndexOutOfBoundsException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPrintable_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.print.Pageable#getNumberOfPages() public abstract int
     * java.awt.print.Pageable.getNumberOfPages()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getNumberOfPages()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
