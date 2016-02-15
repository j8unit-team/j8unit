package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.plaf.basic.BasicMenuUI class
 * javax.swing.plaf.basic.BasicMenuUI}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link BasicMenuUIClassTests}.
 * </p>
 *
 * @see javax.swing.plaf.basic.BasicMenuUI class javax.swing.plaf.basic.BasicMenuUI (the hereby targeted
 *      class-under-test class)
 * @see BasicMenuUIClassTests BasicMenuUIClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BasicMenuUITests<SUT extends javax.swing.plaf.basic.BasicMenuUI>
extends BasicMenuItemUITests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicMenuUI#getMaximumSize(javax.swing.JComponent) public
     * java.awt.Dimension javax.swing.plaf.basic.BasicMenuUI.getMaximumSize(javax.swing.JComponent)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicMenuUI#getMaximumSize(javax.swing.JComponent) public
     * java.awt.Dimension javax.swing.plaf.basic.BasicMenuUI.getMaximumSize(javax.swing.JComponent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicMenuUI#getMaximumSize(javax.swing.JComponent) public java.awt.Dimension
     *      javax.swing.plaf.basic.BasicMenuUI.getMaximumSize(javax.swing.JComponent) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getMaximumSize_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.swing.plaf.basic.BasicMenuUI.ChangeHandler class
     * javax.swing.plaf.basic.BasicMenuUI$ChangeHandler}. The complementary j8unit test interface containing the class
     * relevant aspects is {@link BasicMenuUIClassTests.ChangeHandlerClassTests}.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicMenuUI.ChangeHandler class javax.swing.plaf.basic.BasicMenuUI$ChangeHandler (the
     *      hereby targeted class-under-test class)
     * @see BasicMenuUIClassTests.ChangeHandlerClassTests BasicMenuUIClassTests.ChangeHandlerClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ChangeHandlerTests<SUT extends javax.swing.plaf.basic.BasicMenuUI.ChangeHandler>
    extends org.j8unit.repository.javax.swing.event.ChangeListenerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicMenuUI.ChangeHandler#stateChanged(javax.swing.event.ChangeEvent) public
         * void javax.swing.plaf.basic.BasicMenuUI$ChangeHandler.stateChanged(javax.swing.event.ChangeEvent)}.
         *
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicMenuUI.ChangeHandler#stateChanged(javax.swing.event.ChangeEvent) public
         * void javax.swing.plaf.basic.BasicMenuUI$ChangeHandler.stateChanged(javax.swing.event.ChangeEvent)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.swing.plaf.basic.BasicMenuUI.ChangeHandler#stateChanged(javax.swing.event.ChangeEvent) public void
         *      javax.swing.plaf.basic.BasicMenuUI$ChangeHandler.stateChanged(javax.swing.event.ChangeEvent) (the hereby
         *      targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_stateChanged_ChangeEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}
