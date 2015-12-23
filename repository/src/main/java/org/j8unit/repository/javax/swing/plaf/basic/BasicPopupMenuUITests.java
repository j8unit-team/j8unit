package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicPopupMenuUI class
 * javax.swing.plaf.basic.BasicPopupMenuUI}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicPopupMenuUITests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.plaf.basic.BasicPopupMenuUIClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.plaf.basic.BasicPopupMenuUI
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BasicPopupMenuUITests<SUT extends javax.swing.plaf.basic.BasicPopupMenuUI>
extends org.j8unit.repository.javax.swing.plaf.PopupMenuUITests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicPopupMenuUI#installDefaults() public void
     * javax.swing.plaf.basic.BasicPopupMenuUI.installDefaults()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicPopupMenuUI#installDefaults()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_installDefaults()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicPopupMenuUI#installUI(javax.swing.JComponent) public void
     * javax.swing.plaf.basic.BasicPopupMenuUI.installUI(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicPopupMenuUI#installUI(javax.swing.JComponent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_installUI_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicPopupMenuUI#isPopupTrigger(java.awt.event.MouseEvent) public
     * boolean javax.swing.plaf.basic.BasicPopupMenuUI.isPopupTrigger(java.awt.event.MouseEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicPopupMenuUI#isPopupTrigger(java.awt.event.MouseEvent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_isPopupTrigger_MouseEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicPopupMenuUI#uninstallUI(javax.swing.JComponent) public void
     * javax.swing.plaf.basic.BasicPopupMenuUI.uninstallUI(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicPopupMenuUI#uninstallUI(javax.swing.JComponent)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_uninstallUI_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
