package org.j8unit.repository.javax.swing.event;

import javax.swing.event.TableColumnModelEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TableColumnModelEvent} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.swing.event.TableColumnModelEventTests}).
 */
@RunWith(J8Unit4.class)
public class TableColumnModelEventTest
implements TableColumnModelEventTests<TableColumnModelEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.TableColumnModelEvent]

    @Override
    public TableColumnModelEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.event.TableColumnModelEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.event.TableColumnModelEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.event.TableColumnModelEvent]

}
