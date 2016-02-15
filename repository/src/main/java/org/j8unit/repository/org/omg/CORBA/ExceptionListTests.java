package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CORBA.ExceptionList class org.omg.CORBA.ExceptionList}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ExceptionListClassTests}.
 * </p>
 *
 * @see org.omg.CORBA.ExceptionList class org.omg.CORBA.ExceptionList (the hereby targeted class-under-test class)
 * @see ExceptionListClassTests ExceptionListClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ExceptionListTests<SUT extends org.omg.CORBA.ExceptionList>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.ExceptionList#remove(int) public abstract void
     * org.omg.CORBA.ExceptionList.remove(int) throws org.omg.CORBA.Bounds}.
     *
     * <p>
     * Test method for {@link org.omg.CORBA.ExceptionList#remove(int) public abstract void
     * org.omg.CORBA.ExceptionList.remove(int) throws org.omg.CORBA.Bounds}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CORBA.ExceptionList#remove(int) public abstract void org.omg.CORBA.ExceptionList.remove(int) throws
     *      org.omg.CORBA.Bounds (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_remove_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.ExceptionList#count() public abstract int
     * org.omg.CORBA.ExceptionList.count()}.
     *
     * <p>
     * Test method for {@link org.omg.CORBA.ExceptionList#count() public abstract int
     * org.omg.CORBA.ExceptionList.count()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CORBA.ExceptionList#count() public abstract int org.omg.CORBA.ExceptionList.count() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_count()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.ExceptionList#item(int) public abstract org.omg.CORBA.TypeCode
     * org.omg.CORBA.ExceptionList.item(int) throws org.omg.CORBA.Bounds}.
     *
     * <p>
     * Test method for {@link org.omg.CORBA.ExceptionList#item(int) public abstract org.omg.CORBA.TypeCode
     * org.omg.CORBA.ExceptionList.item(int) throws org.omg.CORBA.Bounds}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CORBA.ExceptionList#item(int) public abstract org.omg.CORBA.TypeCode
     *      org.omg.CORBA.ExceptionList.item(int) throws org.omg.CORBA.Bounds (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_item_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.ExceptionList#add(org.omg.CORBA.TypeCode) public abstract void
     * org.omg.CORBA.ExceptionList.add(org.omg.CORBA.TypeCode)}.
     *
     * <p>
     * Test method for {@link org.omg.CORBA.ExceptionList#add(org.omg.CORBA.TypeCode) public abstract void
     * org.omg.CORBA.ExceptionList.add(org.omg.CORBA.TypeCode)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CORBA.ExceptionList#add(org.omg.CORBA.TypeCode) public abstract void
     *      org.omg.CORBA.ExceptionList.add(org.omg.CORBA.TypeCode) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_add_TypeCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
