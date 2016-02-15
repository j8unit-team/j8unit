package org.j8unit.repository.java.awt;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.ItemSelectable interface java.awt.ItemSelectable}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ItemSelectableClassTests}.
 * </p>
 *
 * @see java.awt.ItemSelectable interface java.awt.ItemSelectable (the hereby targeted class-under-test class)
 * @see ItemSelectableClassTests ItemSelectableClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ItemSelectableTests<SUT extends java.awt.ItemSelectable>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.ItemSelectable#getSelectedObjects() public abstract java.lang.Object[]
     * java.awt.ItemSelectable.getSelectedObjects()}.
     *
     * <p>
     * Test method for {@link java.awt.ItemSelectable#getSelectedObjects() public abstract java.lang.Object[]
     * java.awt.ItemSelectable.getSelectedObjects()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.ItemSelectable#getSelectedObjects() public abstract java.lang.Object[]
     *      java.awt.ItemSelectable.getSelectedObjects() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSelectedObjects()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.ItemSelectable#addItemListener(java.awt.event.ItemListener) public abstract void
     * java.awt.ItemSelectable.addItemListener(java.awt.event.ItemListener)}.
     *
     * <p>
     * Test method for {@link java.awt.ItemSelectable#addItemListener(java.awt.event.ItemListener) public abstract void
     * java.awt.ItemSelectable.addItemListener(java.awt.event.ItemListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.ItemSelectable#addItemListener(java.awt.event.ItemListener) public abstract void
     *      java.awt.ItemSelectable.addItemListener(java.awt.event.ItemListener) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addItemListener_ItemListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.ItemSelectable#removeItemListener(java.awt.event.ItemListener) public abstract
     * void java.awt.ItemSelectable.removeItemListener(java.awt.event.ItemListener)}.
     *
     * <p>
     * Test method for {@link java.awt.ItemSelectable#removeItemListener(java.awt.event.ItemListener) public abstract
     * void java.awt.ItemSelectable.removeItemListener(java.awt.event.ItemListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.ItemSelectable#removeItemListener(java.awt.event.ItemListener) public abstract void
     *      java.awt.ItemSelectable.removeItemListener(java.awt.event.ItemListener) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeItemListener_ItemListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
