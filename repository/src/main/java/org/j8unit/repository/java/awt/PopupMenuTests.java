package org.j8unit.repository.java.awt;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.PopupMenu class java.awt.PopupMenu}. The complementary j8unit
 * test interface containing the class relevant aspects is {@link PopupMenuClassTests}.
 * </p>
 *
 * @see java.awt.PopupMenu class java.awt.PopupMenu (the hereby targeted class-under-test class)
 * @see PopupMenuClassTests PopupMenuClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PopupMenuTests<SUT extends java.awt.PopupMenu>
extends MenuTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.PopupMenu#getAccessibleContext() public javax.accessibility.AccessibleContext
     * java.awt.PopupMenu.getAccessibleContext()}.
     *
     * <p>
     * Test method for {@link java.awt.PopupMenu#getAccessibleContext() public javax.accessibility.AccessibleContext
     * java.awt.PopupMenu.getAccessibleContext()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.PopupMenu#getAccessibleContext() public javax.accessibility.AccessibleContext
     *      java.awt.PopupMenu.getAccessibleContext() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getAccessibleContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.PopupMenu#show(java.awt.Component, int, int) public void
     * java.awt.PopupMenu.show(java.awt.Component,int,int)}.
     *
     * <p>
     * Test method for {@link java.awt.PopupMenu#show(java.awt.Component, int, int) public void
     * java.awt.PopupMenu.show(java.awt.Component,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.PopupMenu#show(java.awt.Component, int, int) public void
     *      java.awt.PopupMenu.show(java.awt.Component,int,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_show_Component_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.PopupMenu#addNotify() public void java.awt.PopupMenu.addNotify()}.
     *
     * <p>
     * Test method for {@link java.awt.PopupMenu#addNotify() public void java.awt.PopupMenu.addNotify()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.PopupMenu#addNotify() public void java.awt.PopupMenu.addNotify() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_addNotify()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.PopupMenu#getParent() public java.awt.MenuContainer
     * java.awt.PopupMenu.getParent()}.
     *
     * <p>
     * Test method for {@link java.awt.PopupMenu#getParent() public java.awt.MenuContainer
     * java.awt.PopupMenu.getParent()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.PopupMenu#getParent() public java.awt.MenuContainer java.awt.PopupMenu.getParent() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getParent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
