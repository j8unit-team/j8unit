package org.j8unit.repository.javax.swing.event;

import javax.swing.event.TableModelListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TableModelListenerClassTest
implements org.j8unit.repository.javax.swing.event.TableModelListenerClassTests<TableModelListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.TableModelListener]

    @Override
    public Class<TableModelListener> createNewSUT() {
        return TableModelListener.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.TableModelListener]

}
