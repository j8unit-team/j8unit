package org.j8unit.repository.java.awt.event;

import java.awt.event.ActionListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ActionListener} (by simply reusing the
 * J8Unit test interface {@link ActionListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class ActionListenerClassTest
implements ActionListenerClassTests<ActionListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.event.ActionListener]

    @Override
    public Class<ActionListener> createNewSUT() {
        return ActionListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.event.ActionListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.event.ActionListener]

}
