package org.j8unit.repository.javax.swing.plaf;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.PopupMenuUI class javax.swing.plaf.PopupMenuUI}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.plaf.PopupMenuUIClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface PopupMenuUITests<SUT extends javax.swing.plaf.PopupMenuUI>
extends org.j8unit.repository.javax.swing.plaf.ComponentUITests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.PopupMenuUI#getPopup(javax.swing.JPopupMenu,int,int) public
     * javax.swing.Popup javax.swing.plaf.PopupMenuUI.getPopup(javax.swing.JPopupMenu,int,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPopup_JPopupMenu_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.PopupMenuUI#isPopupTrigger(java.awt.event.MouseEvent) public boolean
     * javax.swing.plaf.PopupMenuUI.isPopupTrigger(java.awt.event.MouseEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isPopupTrigger_MouseEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
