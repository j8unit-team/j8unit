package org.j8unit.repository.javax.swing.event;

import javax.swing.event.TableModelEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TableModelEvent} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.swing.event.TableModelEventTests}).
 */
@RunWith(J8Unit4.class)
public class TableModelEventTest
implements TableModelEventTests<TableModelEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.TableModelEvent]

    @Override
    public TableModelEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.event.TableModelEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.event.TableModelEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.event.TableModelEvent]

}
