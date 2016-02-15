package org.j8unit.repository.javax.swing;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.ComboBoxModel interface javax.swing.ComboBoxModel}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ComboBoxModelClassTests}.
 * </p>
 *
 * @see javax.swing.ComboBoxModel interface javax.swing.ComboBoxModel (the hereby targeted class-under-test class)
 * @see ComboBoxModelClassTests ComboBoxModelClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ComboBoxModelTests<SUT extends javax.swing.ComboBoxModel<E>, E>
extends ListModelTests<SUT, E> {

    /**
     * <p>
     * Test method for {@link javax.swing.ComboBoxModel#getSelectedItem() public abstract java.lang.Object
     * javax.swing.ComboBoxModel.getSelectedItem()}.
     *
     * <p>
     * Test method for {@link javax.swing.ComboBoxModel#getSelectedItem() public abstract java.lang.Object
     * javax.swing.ComboBoxModel.getSelectedItem()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.ComboBoxModel#getSelectedItem() public abstract java.lang.Object
     *      javax.swing.ComboBoxModel.getSelectedItem() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSelectedItem()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.ComboBoxModel#setSelectedItem(Object) public abstract void
     * javax.swing.ComboBoxModel.setSelectedItem(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link javax.swing.ComboBoxModel#setSelectedItem(Object) public abstract void
     * javax.swing.ComboBoxModel.setSelectedItem(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.ComboBoxModel#setSelectedItem(Object) public abstract void
     *      javax.swing.ComboBoxModel.setSelectedItem(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSelectedItem_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
