package org.j8unit.repository.javax.swing.event;

import javax.swing.event.CellEditorListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CellEditorListener} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.swing.event.CellEditorListenerTests}).
 */

@RunWith(J8Unit4.class)
public class CellEditorListenerTest
implements CellEditorListenerTests<CellEditorListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.CellEditorListener]

    @Override
    public CellEditorListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.event.CellEditorListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.event.CellEditorListener]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.event.CellEditorListener]

}
