package org.j8unit.repository.javax.swing.plaf.basic;

import javax.swing.plaf.basic.BasicRadioButtonMenuItemUI;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link BasicRadioButtonMenuItemUI public class javax.swing.plaf.basic.BasicRadioButtonMenuItemUI}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.swing.plaf.basic.BasicRadioButtonMenuItemUIClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BasicRadioButtonMenuItemUITests<SUT extends BasicRadioButtonMenuItemUI>
extends org.j8unit.repository.javax.swing.plaf.basic.BasicMenuItemUITests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicRadioButtonMenuItemUI]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
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
     * @since 0.9.0
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

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicRadioButtonMenuItemUI]

}
