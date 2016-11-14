package org.j8unit.repository.javax.swing.event;

import javax.swing.event.TableColumnModelListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TableColumnModelListener} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.swing.event.TableColumnModelListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class TableColumnModelListenerClassTest
implements TableColumnModelListenerClassTests<TableColumnModelListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.TableColumnModelListener]

    @Override
    public Class<TableColumnModelListener> createNewSUT() {
        return TableColumnModelListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.TableColumnModelListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.TableColumnModelListener]

}
