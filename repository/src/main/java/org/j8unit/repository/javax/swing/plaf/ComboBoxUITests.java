package org.j8unit.repository.javax.swing.plaf;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.plaf.ComboBoxUI class javax.swing.plaf.ComboBoxUI}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ComboBoxUIClassTests}.
 * </p>
 *
 * @see javax.swing.plaf.ComboBoxUI class javax.swing.plaf.ComboBoxUI (the hereby targeted class-under-test class)
 * @see ComboBoxUIClassTests ComboBoxUIClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ComboBoxUITests<SUT extends javax.swing.plaf.ComboBoxUI>
extends ComponentUITests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.ComboBoxUI#setPopupVisible(javax.swing.JComboBox, boolean) public
     * abstract void javax.swing.plaf.ComboBoxUI.setPopupVisible(javax.swing.JComboBox,boolean)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.ComboBoxUI#setPopupVisible(javax.swing.JComboBox, boolean) public
     * abstract void javax.swing.plaf.ComboBoxUI.setPopupVisible(javax.swing.JComboBox,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.ComboBoxUI#setPopupVisible(javax.swing.JComboBox, boolean) public abstract void
     *      javax.swing.plaf.ComboBoxUI.setPopupVisible(javax.swing.JComboBox,boolean) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setPopupVisible_JComboBox_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.ComboBoxUI#isFocusTraversable(javax.swing.JComboBox) public abstract
     * boolean javax.swing.plaf.ComboBoxUI.isFocusTraversable(javax.swing.JComboBox)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.ComboBoxUI#isFocusTraversable(javax.swing.JComboBox) public abstract
     * boolean javax.swing.plaf.ComboBoxUI.isFocusTraversable(javax.swing.JComboBox)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.ComboBoxUI#isFocusTraversable(javax.swing.JComboBox) public abstract boolean
     *      javax.swing.plaf.ComboBoxUI.isFocusTraversable(javax.swing.JComboBox) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isFocusTraversable_JComboBox()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.ComboBoxUI#isPopupVisible(javax.swing.JComboBox) public abstract boolean
     * javax.swing.plaf.ComboBoxUI.isPopupVisible(javax.swing.JComboBox)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.ComboBoxUI#isPopupVisible(javax.swing.JComboBox) public abstract boolean
     * javax.swing.plaf.ComboBoxUI.isPopupVisible(javax.swing.JComboBox)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.ComboBoxUI#isPopupVisible(javax.swing.JComboBox) public abstract boolean
     *      javax.swing.plaf.ComboBoxUI.isPopupVisible(javax.swing.JComboBox) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isPopupVisible_JComboBox()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
