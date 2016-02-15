package org.j8unit.repository.javax.swing.plaf;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.plaf.PopupMenuUI class javax.swing.plaf.PopupMenuUI}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link PopupMenuUIClassTests}.
 * </p>
 *
 * @see javax.swing.plaf.PopupMenuUI class javax.swing.plaf.PopupMenuUI (the hereby targeted class-under-test class)
 * @see PopupMenuUIClassTests PopupMenuUIClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PopupMenuUITests<SUT extends javax.swing.plaf.PopupMenuUI>
extends ComponentUITests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.PopupMenuUI#isPopupTrigger(java.awt.event.MouseEvent) public boolean
     * javax.swing.plaf.PopupMenuUI.isPopupTrigger(java.awt.event.MouseEvent)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.PopupMenuUI#isPopupTrigger(java.awt.event.MouseEvent) public boolean
     * javax.swing.plaf.PopupMenuUI.isPopupTrigger(java.awt.event.MouseEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.PopupMenuUI#isPopupTrigger(java.awt.event.MouseEvent) public boolean
     *      javax.swing.plaf.PopupMenuUI.isPopupTrigger(java.awt.event.MouseEvent) (the hereby targeted
     *      method-under-test)
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

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.PopupMenuUI#getPopup(javax.swing.JPopupMenu, int, int) public
     * javax.swing.Popup javax.swing.plaf.PopupMenuUI.getPopup(javax.swing.JPopupMenu,int,int)}.
     *
     * <p>
     * Test method for {@link javax.swing.plaf.PopupMenuUI#getPopup(javax.swing.JPopupMenu, int, int) public
     * javax.swing.Popup javax.swing.plaf.PopupMenuUI.getPopup(javax.swing.JPopupMenu,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.plaf.PopupMenuUI#getPopup(javax.swing.JPopupMenu, int, int) public javax.swing.Popup
     *      javax.swing.plaf.PopupMenuUI.getPopup(javax.swing.JPopupMenu,int,int) (the hereby targeted
     *      method-under-test)
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

}
