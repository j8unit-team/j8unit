package org.j8unit.repository.javax.swing.event;

import javax.swing.event.TableModelListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TableModelListener} (by simply reusing
 * the J8Unit test interface {@link TableModelListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class TableModelListenerClassTest
implements TableModelListenerClassTests<TableModelListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.TableModelListener]

    @Override
    public Class<TableModelListener> createNewSUT() {
        return TableModelListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.TableModelListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.TableModelListener]

}
