package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.plaf.basic.BasicCheckBoxMenuItemUI class
 * javax.swing.plaf.basic.BasicCheckBoxMenuItemUI}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.swing.plaf.basic.BasicCheckBoxMenuItemUITests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.plaf.basic.BasicCheckBoxMenuItemUIClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.plaf.basic.BasicCheckBoxMenuItemUI
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BasicCheckBoxMenuItemUITests<SUT extends javax.swing.plaf.basic.BasicCheckBoxMenuItemUI>
extends org.j8unit.repository.javax.swing.plaf.basic.BasicMenuItemUITests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.swing.plaf.basic.BasicCheckBoxMenuItemUI#processMouseEvent(javax.swing.JMenuItem, java.awt.event.MouseEvent, javax.swing.MenuElement[], javax.swing.MenuSelectionManager)
     * public void
     * javax.swing.plaf.basic.BasicCheckBoxMenuItemUI.processMouseEvent(javax.swing.JMenuItem,java.awt.event.MouseEvent,javax.swing.MenuElement[],javax.swing.MenuSelectionManager)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.plaf.basic.BasicCheckBoxMenuItemUI#processMouseEvent(javax.swing.JMenuItem,
     *             java.awt.event.MouseEvent, javax.swing.MenuElement[], javax.swing.MenuSelectionManager)
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
