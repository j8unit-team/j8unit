package org.j8unit.repository.javax.swing.event;

import javax.swing.event.ListSelectionEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ListSelectionEvent} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.swing.event.ListSelectionEventTests}).
 */

@RunWith(J8Unit4.class)
public class ListSelectionEventTest
implements ListSelectionEventTests<ListSelectionEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.ListSelectionEvent]

    @Override
    public ListSelectionEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.event.ListSelectionEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.event.ListSelectionEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.event.ListSelectionEvent]

}