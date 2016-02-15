package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CORBA.ContextList class org.omg.CORBA.ContextList}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ContextListClassTests}.
 * </p>
 *
 * @see org.omg.CORBA.ContextList class org.omg.CORBA.ContextList (the hereby targeted class-under-test class)
 * @see ContextListClassTests ContextListClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ContextListTests<SUT extends org.omg.CORBA.ContextList>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.ContextList#add(String) public abstract void
     * org.omg.CORBA.ContextList.add(java.lang.String)}.
     *
     * <p>
     * Test method for {@link org.omg.CORBA.ContextList#add(String) public abstract void
     * org.omg.CORBA.ContextList.add(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CORBA.ContextList#add(String) public abstract void org.omg.CORBA.ContextList.add(java.lang.String)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_add_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.ContextList#item(int) public abstract java.lang.String
     * org.omg.CORBA.ContextList.item(int) throws org.omg.CORBA.Bounds}.
     *
     * <p>
     * Test method for {@link org.omg.CORBA.ContextList#item(int) public abstract java.lang.String
     * org.omg.CORBA.ContextList.item(int) throws org.omg.CORBA.Bounds}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CORBA.ContextList#item(int) public abstract java.lang.String org.omg.CORBA.ContextList.item(int)
     *      throws org.omg.CORBA.Bounds (the hereby targeted method-under-test)
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
     * Test method for {@link org.omg.CORBA.ContextList#remove(int) public abstract void
     * org.omg.CORBA.ContextList.remove(int) throws org.omg.CORBA.Bounds}.
     *
     * <p>
     * Test method for {@link org.omg.CORBA.ContextList#remove(int) public abstract void
     * org.omg.CORBA.ContextList.remove(int) throws org.omg.CORBA.Bounds}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CORBA.ContextList#remove(int) public abstract void org.omg.CORBA.ContextList.remove(int) throws
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
     * Test method for {@link org.omg.CORBA.ContextList#count() public abstract int org.omg.CORBA.ContextList.count()}.
     *
     * <p>
     * Test method for {@link org.omg.CORBA.ContextList#count() public abstract int org.omg.CORBA.ContextList.count()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.CORBA.ContextList#count() public abstract int org.omg.CORBA.ContextList.count() (the hereby targeted
     *      method-under-test)
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

}
