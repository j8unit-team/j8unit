package org.j8unit.repository.javax.swing.plaf;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.PopupMenuUI class javax.swing.plaf.PopupMenuUI},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.plaf.PopupMenuUIClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface PopupMenuUITests<SUT extends javax.swing.plaf.PopupMenuUI>
extends org.j8unit.repository.javax.swing.plaf.ComponentUITests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.PopupMenuUI#isPopupTrigger(java.awt.event.MouseEvent) public boolean javax.swing.plaf.PopupMenuUI.isPopupTrigger(java.awt.event.MouseEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isPopupTrigger_MouseEvent() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.PopupMenuUI#getPopup(javax.swing.JPopupMenu,int,int) public javax.swing.Popup javax.swing.plaf.PopupMenuUI.getPopup(javax.swing.JPopupMenu,int,int)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPopup_JPopupMenu_int_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
