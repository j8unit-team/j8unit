package org.j8unit.repository.javax.swing;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.JPanel class javax.swing.JPanel}. The complementary j8unit
 * test interface containing the class relevant aspects is {@link JPanelClassTests}.
 * </p>
 *
 * @see javax.swing.JPanel class javax.swing.JPanel (the hereby targeted class-under-test class)
 * @see JPanelClassTests JPanelClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JPanelTests<SUT extends javax.swing.JPanel>
extends org.j8unit.repository.javax.accessibility.AccessibleTests<SUT>, JComponentTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.JPanel#getAccessibleContext() public javax.accessibility.AccessibleContext
     * javax.swing.JPanel.getAccessibleContext()}.
     *
     * <p>
     * Test method for {@link javax.swing.JPanel#getAccessibleContext() public javax.accessibility.AccessibleContext
     * javax.swing.JPanel.getAccessibleContext()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JPanel#getAccessibleContext() public javax.accessibility.AccessibleContext
     *      javax.swing.JPanel.getAccessibleContext() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.swing.JPanel#getUIClassID() public java.lang.String
     * javax.swing.JPanel.getUIClassID()}.
     *
     * <p>
     * Test method for {@link javax.swing.JPanel#getUIClassID() public java.lang.String
     * javax.swing.JPanel.getUIClassID()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JPanel#getUIClassID() public java.lang.String javax.swing.JPanel.getUIClassID() (the hereby
     *      targeted method-under-test)
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
     * Test method for {@link javax.swing.JPanel#updateUI() public void javax.swing.JPanel.updateUI()}.
     *
     * <p>
     * Test method for {@link javax.swing.JPanel#updateUI() public void javax.swing.JPanel.updateUI()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JPanel#updateUI() public void javax.swing.JPanel.updateUI() (the hereby targeted
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

    /**
     * <p>
     * Test method for {@link javax.swing.JPanel#setUI(javax.swing.plaf.PanelUI) public void
     * javax.swing.JPanel.setUI(javax.swing.plaf.PanelUI)}.
     *
     * <p>
     * Test method for {@link javax.swing.JPanel#setUI(javax.swing.plaf.PanelUI) public void
     * javax.swing.JPanel.setUI(javax.swing.plaf.PanelUI)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JPanel#setUI(javax.swing.plaf.PanelUI) public void
     *      javax.swing.JPanel.setUI(javax.swing.plaf.PanelUI) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setUI_PanelUI()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.JPanel#getUI() public javax.swing.plaf.PanelUI javax.swing.JPanel.getUI()}.
     *
     * <p>
     * Test method for {@link javax.swing.JPanel#getUI() public javax.swing.plaf.PanelUI javax.swing.JPanel.getUI()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.JPanel#getUI() public javax.swing.plaf.PanelUI javax.swing.JPanel.getUI() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getUI()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
