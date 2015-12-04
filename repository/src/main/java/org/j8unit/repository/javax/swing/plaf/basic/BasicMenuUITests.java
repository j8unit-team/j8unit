package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.basic.BasicMenuUI class javax.swing.plaf.basic.BasicMenuUI}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.plaf.basic.BasicMenuUIClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface BasicMenuUITests<SUT extends javax.swing.plaf.basic.BasicMenuUI>
extends org.j8unit.repository.javax.swing.plaf.basic.BasicMenuItemUITests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicMenuUI#getMaximumSize(javax.swing.JComponent) public
     * java.awt.Dimension javax.swing.plaf.basic.BasicMenuUI.getMaximumSize(javax.swing.JComponent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getMaximumSize_JComponent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test class for {@link javax.swing.plaf.basic.BasicMenuUI$ChangeHandler class
     * javax.swing.plaf.basic.BasicMenuUI$ChangeHandler}, containing all instance relevant test methods (i.&thinsp;e.,
     * test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.swing.plaf.basic.BasicMenuUIClassTests.ChangeHandlerClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ChangeHandlerTests<SUT extends javax.swing.plaf.basic.BasicMenuUI.ChangeHandler>
    extends org.j8unit.repository.javax.swing.event.ChangeListenerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for
         * {@link javax.swing.plaf.basic.BasicMenuUI.ChangeHandler#stateChanged(javax.swing.event.ChangeEvent) public
         * void javax.swing.plaf.basic.BasicMenuUI$ChangeHandler.stateChanged(javax.swing.event.ChangeEvent)}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
        public default void test_stateChanged_ChangeEvent()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}
