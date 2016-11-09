package org.j8unit.repository.javax.swing.undo;

import javax.swing.undo.StateEditable;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link StateEditable} (by simply reusing the
 * J8Unit test interface {@link StateEditableTests}).
 */

@RunWith(J8Unit4.class)
public class StateEditableTest
implements StateEditableTests<StateEditable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.undo.StateEditable]

    @Override
    public StateEditable createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.undo.StateEditable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.undo.StateEditable]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.undo.StateEditable]

}
