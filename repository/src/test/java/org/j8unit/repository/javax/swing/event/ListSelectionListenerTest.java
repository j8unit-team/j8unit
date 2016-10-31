package org.j8unit.repository.javax.swing.event;

import javax.swing.event.ListSelectionListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ListSelectionListenerTest
implements org.j8unit.repository.javax.swing.event.ListSelectionListenerTests<ListSelectionListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.ListSelectionListener]

    @Override
    public ListSelectionListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.event.ListSelectionListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.event.ListSelectionListener]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.event.ListSelectionListener]

}
