package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.basic.BasicRadioButtonMenuItemUI class
 * javax.swing.plaf.basic.BasicRadioButtonMenuItemUI}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.plaf.basic.BasicRadioButtonMenuItemUIClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BasicRadioButtonMenuItemUITests<SUT extends javax.swing.plaf.basic.BasicRadioButtonMenuItemUI>
extends org.j8unit.repository.javax.swing.plaf.basic.BasicMenuItemUITests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.swing.plaf.basic.BasicRadioButtonMenuItemUI#processMouseEvent(javax.swing.JMenuItem,java.awt.event.MouseEvent,javax.swing.MenuElement[],javax.swing.MenuSelectionManager)
     * public void
     * javax.swing.plaf.basic.BasicRadioButtonMenuItemUI.processMouseEvent(javax.swing.JMenuItem,java.awt.event.MouseEvent,javax.swing.MenuElement[],javax.swing.MenuSelectionManager)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_processMouseEvent_JMenuItem_MouseEvent_MenuElementArray_MenuSelectionManager()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
