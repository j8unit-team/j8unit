package org.j8unit.repository.javax.swing.undo;

import javax.swing.undo.UndoableEdit;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link UndoableEdit} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.undo.UndoableEditClassTests}).
 */

@RunWith(J8Unit4.class)
public class UndoableEditClassTest
implements UndoableEditClassTests<UndoableEdit> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.undo.UndoableEdit]

    @Override
    public Class<UndoableEdit> createNewSUT() {
        return UndoableEdit.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.undo.UndoableEdit]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.undo.UndoableEdit]

}
