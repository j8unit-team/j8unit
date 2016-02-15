package org.j8unit.repository.javax.swing;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.ListModel interface javax.swing.ListModel}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link ListModelClassTests}.
 * </p>
 *
 * @see javax.swing.ListModel interface javax.swing.ListModel (the hereby targeted class-under-test class)
 * @see ListModelClassTests ListModelClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ListModelTests<SUT extends javax.swing.ListModel<E>, E>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.ListModel#getElementAt(int) public abstract E
     * javax.swing.ListModel.getElementAt(int)}.
     *
     * <p>
     * Test method for {@link javax.swing.ListModel#getElementAt(int) public abstract java.lang.Object
     * javax.swing.ListModel.getElementAt(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.ListModel#getElementAt(int) public abstract java.lang.Object
     *      javax.swing.ListModel.getElementAt(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getElementAt_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.ListModel#addListDataListener(javax.swing.event.ListDataListener) public
     * abstract void javax.swing.ListModel.addListDataListener(javax.swing.event.ListDataListener)}.
     *
     * <p>
     * Test method for {@link javax.swing.ListModel#addListDataListener(javax.swing.event.ListDataListener) public
     * abstract void javax.swing.ListModel.addListDataListener(javax.swing.event.ListDataListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.ListModel#addListDataListener(javax.swing.event.ListDataListener) public abstract void
     *      javax.swing.ListModel.addListDataListener(javax.swing.event.ListDataListener) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addListDataListener_ListDataListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.ListModel#getSize() public abstract int javax.swing.ListModel.getSize()}.
     *
     * <p>
     * Test method for {@link javax.swing.ListModel#getSize() public abstract int javax.swing.ListModel.getSize()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.ListModel#getSize() public abstract int javax.swing.ListModel.getSize() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSize()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.ListModel#removeListDataListener(javax.swing.event.ListDataListener) public
     * abstract void javax.swing.ListModel.removeListDataListener(javax.swing.event.ListDataListener)}.
     *
     * <p>
     * Test method for {@link javax.swing.ListModel#removeListDataListener(javax.swing.event.ListDataListener) public
     * abstract void javax.swing.ListModel.removeListDataListener(javax.swing.event.ListDataListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.ListModel#removeListDataListener(javax.swing.event.ListDataListener) public abstract void
     *      javax.swing.ListModel.removeListDataListener(javax.swing.event.ListDataListener) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeListDataListener_ListDataListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
