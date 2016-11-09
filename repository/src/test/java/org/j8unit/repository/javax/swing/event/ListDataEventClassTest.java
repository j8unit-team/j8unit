package org.j8unit.repository.javax.swing.event;

import javax.swing.event.ListDataEvent;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ListDataEvent} (by simply reusing the
 * J8Unit test interface {@link ListDataEventClassTests}).
 */

@RunWith(J8Unit4.class)
public class ListDataEventClassTest
implements ListDataEventClassTests<ListDataEvent> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.ListDataEvent]

    @Override
    public Class<ListDataEvent> createNewSUT() {
        return ListDataEvent.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.event.ListDataEvent#ListDataEvent(Object, int, int, int) public
     * javax.swing.event.ListDataEvent(java.lang.Object,int,int,int)}.
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
    public void create_ListDataEvent_Object_int_int_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ListDataEvent sut = null; // = new ListDataEvent(Object, int, int, int);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.ListDataEvent]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.ListDataEvent]

}
