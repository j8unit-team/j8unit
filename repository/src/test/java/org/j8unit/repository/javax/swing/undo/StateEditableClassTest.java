package org.j8unit.repository.javax.swing.undo;

import javax.swing.undo.StateEditable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link StateEditable} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.undo.StateEditableClassTests}).
 */
@RunWith(J8Unit4.class)
public class StateEditableClassTest
implements StateEditableClassTests<StateEditable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.undo.StateEditable]

    @Override
    public Class<StateEditable> createNewSUT() {
        return StateEditable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.undo.StateEditable]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.undo.StateEditable]

}
