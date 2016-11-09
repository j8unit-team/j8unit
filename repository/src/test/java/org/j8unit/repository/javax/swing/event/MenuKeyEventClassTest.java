package org.j8unit.repository.javax.swing.event;

import javax.swing.event.MenuKeyEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MenuKeyEvent} (by simply reusing the
 * J8Unit test interface {@link MenuKeyEventClassTests}).
 */

@RunWith(J8Unit4.class)
public class MenuKeyEventClassTest
implements MenuKeyEventClassTests<MenuKeyEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.MenuKeyEvent]

    @Override
    public Class<MenuKeyEvent> createNewSUT() {
        return MenuKeyEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.event.MenuKeyEvent#MenuKeyEvent(java.awt.Component, int, long, int, int, char, javax.swing.MenuElement[], javax.swing.MenuSelectionManager)
     * public
     * javax.swing.event.MenuKeyEvent(java.awt.Component,int,long,int,int,char,javax.swing.MenuElement[],javax.swing.MenuSelectionManager)}.
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
    public void create_MenuKeyEvent_Component_int_long_int_int_char_MenuElementArray_MenuSelectionManager()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MenuKeyEvent sut = null; // = new MenuKeyEvent(java.awt.Component, int, long, int, int, char,
                                       // javax.swing.MenuElement[], javax.swing.MenuSelectionManager);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.MenuKeyEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.MenuKeyEvent]

}
