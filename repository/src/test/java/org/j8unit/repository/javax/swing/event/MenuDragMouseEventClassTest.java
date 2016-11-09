package org.j8unit.repository.javax.swing.event;

import javax.swing.event.MenuDragMouseEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MenuDragMouseEvent} (by simply reusing
 * the J8Unit test interface {@link MenuDragMouseEventClassTests}).
 */

@RunWith(J8Unit4.class)
public class MenuDragMouseEventClassTest
implements MenuDragMouseEventClassTests<MenuDragMouseEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.MenuDragMouseEvent]

    @Override
    public Class<MenuDragMouseEvent> createNewSUT() {
        return MenuDragMouseEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.event.MenuDragMouseEvent#MenuDragMouseEvent(java.awt.Component, int, long, int, int, int, int, boolean, javax.swing.MenuElement[], javax.swing.MenuSelectionManager)
     * public
     * javax.swing.event.MenuDragMouseEvent(java.awt.Component,int,long,int,int,int,int,boolean,javax.swing.MenuElement[],javax.swing.MenuSelectionManager)}.
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
    public void create_MenuDragMouseEvent_Component_int_long_int_int_int_int_boolean_MenuElementArray_MenuSelectionManager()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MenuDragMouseEvent sut = null; // = new MenuDragMouseEvent(java.awt.Component, int, long, int, int, int,
                                             // int, boolean, javax.swing.MenuElement[],
                                             // javax.swing.MenuSelectionManager);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.event.MenuDragMouseEvent#MenuDragMouseEvent(java.awt.Component, int, long, int, int, int, int, int, int, boolean, javax.swing.MenuElement[], javax.swing.MenuSelectionManager)
     * public
     * javax.swing.event.MenuDragMouseEvent(java.awt.Component,int,long,int,int,int,int,int,int,boolean,javax.swing.MenuElement[],javax.swing.MenuSelectionManager)}.
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
    public void create_MenuDragMouseEvent_Component_int_long_int_int_int_int_int_int_boolean_MenuElementArray_MenuSelectionManager()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MenuDragMouseEvent sut = null; // = new MenuDragMouseEvent(java.awt.Component, int, long, int, int, int,
                                             // int, int, int, boolean, javax.swing.MenuElement[],
                                             // javax.swing.MenuSelectionManager);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.MenuDragMouseEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.MenuDragMouseEvent]

}
