package org.j8unit.repository.javax.swing.undo;

import javax.swing.undo.UndoableEdit;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link UndoableEdit} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.undo.UndoableEditTests}).
 */

@RunWith(J8Unit4.class)
public class UndoableEditTest
implements UndoableEditTests<UndoableEdit> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.undo.UndoableEdit]

    @Override
    public UndoableEdit createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.undo.UndoableEdit], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.undo.UndoableEdit]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.undo.UndoableEdit]

}
