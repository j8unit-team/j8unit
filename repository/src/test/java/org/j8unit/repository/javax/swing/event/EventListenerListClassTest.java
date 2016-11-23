package org.j8unit.repository.javax.swing.event;

import javax.swing.event.EventListenerList;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link EventListenerList} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.event.EventListenerListClassTests}).
 */

@RunWith(J8Unit4.class)
public class EventListenerListClassTest
implements EventListenerListClassTests<EventListenerList> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.EventListenerList]

    @Override
    public Class<EventListenerList> createNewSUT() {
        return EventListenerList.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.event.EventListenerList#EventListenerList() public javax.swing.event.EventListenerList()}.
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
    public void create_EventListenerList()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final EventListenerList sut = new EventListenerList();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.EventListenerList]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.EventListenerList]

}
