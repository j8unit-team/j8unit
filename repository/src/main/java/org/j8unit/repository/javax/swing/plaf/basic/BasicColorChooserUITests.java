package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.plaf.basic.BasicColorChooserUI class
 * javax.swing.plaf.basic.BasicColorChooserUI}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link BasicColorChooserUIClassTests}.
 * </p>
 *
 * @see javax.swing.plaf.basic.BasicColorChooserUI class javax.swing.plaf.basic.BasicColorChooserUI (the hereby targeted
 *      class-under-test class)
 * @see BasicColorChooserUIClassTests BasicColorChooserUIClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BasicColorChooserUITests<SUT extends javax.swing.plaf.basic.BasicColorChooserUI>
extends org.j8unit.repository.javax.swing.plaf.ColorChooserUITests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicColorChooserUI#installUI(javax.swing.JComponent) public void
     * javax.swing.plaf.basic.BasicColorChooserUI.installUI(javax.swing.JComponent)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicColorChooserUI#installUI(javax.swing.JComponent) public void
     * javax.swing.plaf.basic.BasicColorChooserUI.installUI(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicColorChooserUI#installUI(javax.swing.JComponent) public void
     *      javax.swing.plaf.basic.BasicColorChooserUI.installUI(javax.swing.JComponent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_installUI_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicColorChooserUI#uninstallUI(javax.swing.JComponent) public void
     * javax.swing.plaf.basic.BasicColorChooserUI.uninstallUI(javax.swing.JComponent)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicColorChooserUI#uninstallUI(javax.swing.JComponent) public void
     * javax.swing.plaf.basic.BasicColorChooserUI.uninstallUI(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicColorChooserUI#uninstallUI(javax.swing.JComponent) public void
     *      javax.swing.plaf.basic.BasicColorChooserUI.uninstallUI(javax.swing.JComponent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_uninstallUI_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.basic.BasicColorChooserUI.PropertyHandler class
     * javax.swing.plaf.basic.BasicColorChooserUI$PropertyHandler}. The complementary j8unit test interface containing
     * the class relevant aspects is {@link BasicColorChooserUIClassTests.PropertyHandlerClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicColorChooserUI.PropertyHandler class
     *      javax.swing.plaf.basic.BasicColorChooserUI$PropertyHandler (the hereby targeted class-under-test class)
     * @see BasicColorChooserUIClassTests.PropertyHandlerClassTests
     *      BasicColorChooserUIClassTests.PropertyHandlerClassTests (the complementary j8unit test interface containing
     *      the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface PropertyHandlerTests<SUT extends javax.swing.plaf.basic.BasicColorChooserUI.PropertyHandler>
    extends org.j8unit.repository.java.beans.PropertyChangeListenerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicColorChooserUI.PropertyHandler#propertyChange(java.beans.PropertyChangeEvent)
         * public void
         * javax.swing.plaf.basic.BasicColorChooserUI$PropertyHandler.propertyChange(java.beans.PropertyChangeEvent)}.
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicColorChooserUI.PropertyHandler#propertyChange(java.beans.PropertyChangeEvent)
         * public void
         * javax.swing.plaf.basic.BasicColorChooserUI$PropertyHandler.propertyChange(java.beans.PropertyChangeEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.basic.BasicColorChooserUI.PropertyHandler#propertyChange(java.beans.PropertyChangeEvent)
         *      public void javax.swing.plaf.basic.BasicColorChooserUI$PropertyHandler.propertyChange(java.beans.
         *      PropertyChangeEvent) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_propertyChange_PropertyChangeEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}
