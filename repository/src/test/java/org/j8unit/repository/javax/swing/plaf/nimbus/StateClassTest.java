package org.j8unit.repository.javax.swing.plaf.nimbus;

import javax.swing.plaf.nimbus.State;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link State} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.javax.swing.plaf.nimbus.StateClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class StateClassTest
implements org.j8unit.repository.javax.swing.plaf.nimbus.StateClassTests<State> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.plaf.nimbus.State]

    @Override
    public Class<State> createNewSUT() {
        return State.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.plaf.nimbus.State]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.plaf.nimbus.State]

}
