package org.j8unit.repository.javax.swing.event;

import javax.swing.event.CellEditorListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CellEditorListener} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.swing.event.CellEditorListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class CellEditorListenerClassTest
implements CellEditorListenerClassTests<CellEditorListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.CellEditorListener]

    @Override
    public Class<CellEditorListener> createNewSUT() {
        return CellEditorListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.CellEditorListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.CellEditorListener]

}
