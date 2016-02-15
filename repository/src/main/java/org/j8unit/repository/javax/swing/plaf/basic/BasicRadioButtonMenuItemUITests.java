package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.plaf.basic.BasicRadioButtonMenuItemUI class
 * javax.swing.plaf.basic.BasicRadioButtonMenuItemUI}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link BasicRadioButtonMenuItemUIClassTests}.
 * </p>
 *
 * @see javax.swing.plaf.basic.BasicRadioButtonMenuItemUI class javax.swing.plaf.basic.BasicRadioButtonMenuItemUI (the
 *      hereby targeted class-under-test class)
 * @see BasicRadioButtonMenuItemUIClassTests BasicRadioButtonMenuItemUIClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BasicRadioButtonMenuItemUITests<SUT extends javax.swing.plaf.basic.BasicRadioButtonMenuItemUI>
extends BasicMenuItemUITests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.swing.plaf.basic.BasicRadioButtonMenuItemUI#processMouseEvent(javax.swing.JMenuItem, java.awt.event.MouseEvent, javax.swing.MenuElement[], javax.swing.MenuSelectionManager)
     * public void
     * javax.swing.plaf.basic.BasicRadioButtonMenuItemUI.processMouseEvent(javax.swing.JMenuItem,java.awt.event.MouseEvent,javax.swing.MenuElement[],javax.swing.MenuSelectionManager)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.swing.plaf.basic.BasicRadioButtonMenuItemUI#processMouseEvent(javax.swing.JMenuItem, java.awt.event.MouseEvent, javax.swing.MenuElement[], javax.swing.MenuSelectionManager)
     * public void
     * javax.swing.plaf.basic.BasicRadioButtonMenuItemUI.processMouseEvent(javax.swing.JMenuItem,java.awt.event.MouseEvent,javax.swing.MenuElement[],javax.swing.MenuSelectionManager)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.basic.BasicRadioButtonMenuItemUI#processMouseEvent(javax.swing.JMenuItem,
     *      java.awt.event.MouseEvent, javax.swing.MenuElement[], javax.swing.MenuSelectionManager) public void
     *      javax.swing.plaf.basic.BasicRadioButtonMenuItemUI.processMouseEvent(javax.swing.JMenuItem,java.awt.event.
     *      MouseEvent,javax.swing.MenuElement[],javax.swing.MenuSelectionManager) (the hereby targeted
     *      method-under-test)
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
