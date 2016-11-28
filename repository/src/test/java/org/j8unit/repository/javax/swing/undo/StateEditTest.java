package org.j8unit.repository.javax.swing.undo;

import javax.swing.undo.StateEdit;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link StateEdit} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.undo.StateEditTests}).
 */
@RunWith(J8Unit4.class)
public class StateEditTest
implements StateEditTests<StateEdit> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.undo.StateEdit]

    @Override
    public StateEdit createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.undo.StateEdit], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.undo.StateEdit]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.undo.StateEdit]

}
