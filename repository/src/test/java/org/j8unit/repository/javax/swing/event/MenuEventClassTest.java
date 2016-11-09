package org.j8unit.repository.javax.swing.event;

import javax.swing.event.MenuEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MenuEvent} (by simply reusing the J8Unit
 * test interface {@link MenuEventClassTests}).
 */

@RunWith(J8Unit4.class)
public class MenuEventClassTest
implements MenuEventClassTests<MenuEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.MenuEvent]

    @Override
    public Class<MenuEvent> createNewSUT() {
        return MenuEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.swing.event.MenuEvent#MenuEvent(Object)
     * public javax.swing.event.MenuEvent(java.lang.Object)}.
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
    public void create_MenuEvent_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MenuEvent sut = null; // = new MenuEvent(Object);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.MenuEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.MenuEvent]

}
