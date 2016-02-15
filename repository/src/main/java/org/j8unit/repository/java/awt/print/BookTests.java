package org.j8unit.repository.java.awt.print;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.print.Book class java.awt.print.Book}. The complementary j8unit
 * test interface containing the class relevant aspects is {@link BookClassTests}.
 * </p>
 *
 * @see java.awt.print.Book class java.awt.print.Book (the hereby targeted class-under-test class)
 * @see BookClassTests BookClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BookTests<SUT extends java.awt.print.Book>
extends PageableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.print.Book#getNumberOfPages() public int java.awt.print.Book.getNumberOfPages()}.
     *
     * <p>
     * Test method for {@link java.awt.print.Book#getNumberOfPages() public int java.awt.print.Book.getNumberOfPages()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.print.Book#getNumberOfPages() public int java.awt.print.Book.getNumberOfPages() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getNumberOfPages()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.print.Book#getPrintable(int) public java.awt.print.Printable
     * java.awt.print.Book.getPrintable(int) throws java.lang.IndexOutOfBoundsException}.
     *
     * <p>
     * Test method for {@link java.awt.print.Book#getPrintable(int) public java.awt.print.Printable
     * java.awt.print.Book.getPrintable(int) throws java.lang.IndexOutOfBoundsException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.print.Book#getPrintable(int) public java.awt.print.Printable java.awt.print.Book.getPrintable(int)
     *      throws java.lang.IndexOutOfBoundsException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.awt.print.Book#getPageFormat(int) public java.awt.print.PageFormat
     * java.awt.print.Book.getPageFormat(int) throws java.lang.IndexOutOfBoundsException}.
     *
     * <p>
     * Test method for {@link java.awt.print.Book#getPageFormat(int) public java.awt.print.PageFormat
     * java.awt.print.Book.getPageFormat(int) throws java.lang.IndexOutOfBoundsException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.print.Book#getPageFormat(int) public java.awt.print.PageFormat
     *      java.awt.print.Book.getPageFormat(int) throws java.lang.IndexOutOfBoundsException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link java.awt.print.Book#setPage(int, java.awt.print.Printable, java.awt.print.PageFormat)
     * public void java.awt.print.Book.setPage(int,java.awt.print.Printable,java.awt.print.PageFormat) throws
     * java.lang.IndexOutOfBoundsException}.
     *
     * <p>
     * Test method for {@link java.awt.print.Book#setPage(int, java.awt.print.Printable, java.awt.print.PageFormat)
     * public void java.awt.print.Book.setPage(int,java.awt.print.Printable,java.awt.print.PageFormat) throws
     * java.lang.IndexOutOfBoundsException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.print.Book#setPage(int, java.awt.print.Printable, java.awt.print.PageFormat) public void
     *      java.awt.print.Book.setPage(int,java.awt.print.Printable,java.awt.print.PageFormat) throws
     *      java.lang.IndexOutOfBoundsException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setPage_int_Printable_PageFormat()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.print.Book#append(java.awt.print.Printable, java.awt.print.PageFormat, int)
     * public void java.awt.print.Book.append(java.awt.print.Printable,java.awt.print.PageFormat,int)}.
     *
     * <p>
     * Test method for {@link java.awt.print.Book#append(java.awt.print.Printable, java.awt.print.PageFormat, int)
     * public void java.awt.print.Book.append(java.awt.print.Printable,java.awt.print.PageFormat,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.print.Book#append(java.awt.print.Printable, java.awt.print.PageFormat, int) public void
     *      java.awt.print.Book.append(java.awt.print.Printable,java.awt.print.PageFormat,int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_append_Printable_PageFormat_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.print.Book#append(java.awt.print.Printable, java.awt.print.PageFormat) public
     * void java.awt.print.Book.append(java.awt.print.Printable,java.awt.print.PageFormat)}.
     *
     * <p>
     * Test method for {@link java.awt.print.Book#append(java.awt.print.Printable, java.awt.print.PageFormat) public
     * void java.awt.print.Book.append(java.awt.print.Printable,java.awt.print.PageFormat)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.print.Book#append(java.awt.print.Printable, java.awt.print.PageFormat) public void
     *      java.awt.print.Book.append(java.awt.print.Printable,java.awt.print.PageFormat) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_append_Printable_PageFormat()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
