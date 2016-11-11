package org.j8unit.repository.javax.swing.event;

import javax.swing.event.PopupMenuEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PopupMenuEvent} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.event.PopupMenuEventClassTests}).
 */

@RunWith(J8Unit4.class)
public class PopupMenuEventClassTest
implements PopupMenuEventClassTests<PopupMenuEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.PopupMenuEvent]

    @Override
    public Class<PopupMenuEvent> createNewSUT() {
        return PopupMenuEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.event.PopupMenuEvent#PopupMenuEvent(Object) public
     * javax.swing.event.PopupMenuEvent(java.lang.Object)}.
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
    public void create_PopupMenuEvent_Object()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PopupMenuEvent sut = null; // = new PopupMenuEvent(Object);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.PopupMenuEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.PopupMenuEvent]

}
