package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicColorChooserUI class
 * javax.swing.plaf.basic.BasicColorChooserUI}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.swing.plaf.basic.BasicColorChooserUITests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.plaf.basic.BasicColorChooserUIClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.plaf.basic.BasicColorChooserUI
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BasicColorChooserUITests<SUT extends javax.swing.plaf.basic.BasicColorChooserUI>
extends org.j8unit.repository.javax.swing.plaf.ColorChooserUITests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicColorChooserUI.PropertyHandler class
     * javax.swing.plaf.basic.BasicColorChooserUI$PropertyHandler}, containing all instance relevant test methods
     * (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the
     * class relevant test methods is
     * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicColorChooserUITests.PropertyHandlerTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicColorChooserUIClassTests.PropertyHandlerClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicColorChooserUI.PropertyHandler
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
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.swing.plaf.basic.BasicColorChooserUI.PropertyHandler#propertyChange(java.beans.
         *             PropertyChangeEvent)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_propertyChange_PropertyChangeEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicColorChooserUI#installUI(javax.swing.JComponent) public void
     * javax.swing.plaf.basic.BasicColorChooserUI.installUI(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicColorChooserUI#installUI(javax.swing.JComponent)
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
     * Test method for {@link javax.swing.plaf.basic.BasicColorChooserUI#uninstallUI(javax.swing.JComponent) public void
     * javax.swing.plaf.basic.BasicColorChooserUI.uninstallUI(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicColorChooserUI#uninstallUI(javax.swing.JComponent)
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
