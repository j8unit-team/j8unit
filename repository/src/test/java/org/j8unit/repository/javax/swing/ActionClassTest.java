package org.j8unit.repository.javax.swing;

import javax.swing.Action;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Action} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.swing.ActionClassTests}).
 */

@RunWith(J8Unit4.class)
public class ActionClassTest
implements ActionClassTests<Action> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.Action]

    @Override
    public Class<Action> createNewSUT() {
        return Action.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.Action]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.Action]

}
