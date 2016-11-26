package org.j8unit.repository.javax.swing.event;

import javax.swing.event.TreeModelEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TreeModelEvent} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.swing.event.TreeModelEventTests}).
 */
@RunWith(J8Unit4.class)
public class TreeModelEventTest
implements TreeModelEventTests<TreeModelEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.TreeModelEvent]

    @Override
    public TreeModelEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.event.TreeModelEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.event.TreeModelEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.event.TreeModelEvent]

}
