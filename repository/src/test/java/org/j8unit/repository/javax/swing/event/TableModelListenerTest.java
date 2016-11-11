package org.j8unit.repository.javax.swing.event;

import javax.swing.event.TableModelListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TableModelListener} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.swing.event.TableModelListenerTests}).
 */

@RunWith(J8Unit4.class)
public class TableModelListenerTest
implements TableModelListenerTests<TableModelListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.TableModelListener]

    @Override
    public TableModelListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.event.TableModelListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.event.TableModelListener]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.event.TableModelListener]

}
