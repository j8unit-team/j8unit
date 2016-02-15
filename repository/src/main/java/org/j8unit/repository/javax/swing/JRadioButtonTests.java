package org.j8unit.repository.javax.swing;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.JRadioButton class javax.swing.JRadioButton}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link JRadioButtonClassTests}.
 * </p>
 *
 * @see javax.swing.JRadioButton class javax.swing.JRadioButton (the hereby targeted class-under-test class)
 * @see JRadioButtonClassTests JRadioButtonClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JRadioButtonTests<SUT extends javax.swing.JRadioButton>
extends org.j8unit.repository.javax.accessibility.AccessibleTests<SUT>, JToggleButtonTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.JRadioButton#getAccessibleContext() public
     * javax.accessibility.AccessibleContext javax.swing.JRadioButton.getAccessibleContext()}.
     *
     * <p>
     * Test method for {@link javax.swing.JRadioButton#getAccessibleContext() public
     * javax.accessibility.AccessibleContext javax.swing.JRadioButton.getAccessibleContext()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JRadioButton#getAccessibleContext() public javax.accessibility.AccessibleContext
     *      javax.swing.JRadioButton.getAccessibleContext() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.swing.JRadioButton#getUIClassID() public java.lang.String
     * javax.swing.JRadioButton.getUIClassID()}.
     *
     * <p>
     * Test method for {@link javax.swing.JRadioButton#getUIClassID() public java.lang.String
     * javax.swing.JRadioButton.getUIClassID()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JRadioButton#getUIClassID() public java.lang.String javax.swing.JRadioButton.getUIClassID() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getUIClassID()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JRadioButton#updateUI() public void javax.swing.JRadioButton.updateUI()}.
     *
     * <p>
     * Test method for {@link javax.swing.JRadioButton#updateUI() public void javax.swing.JRadioButton.updateUI()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JRadioButton#updateUI() public void javax.swing.JRadioButton.updateUI() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_updateUI()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
