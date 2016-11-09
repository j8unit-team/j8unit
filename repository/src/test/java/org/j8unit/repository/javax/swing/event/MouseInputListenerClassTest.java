package org.j8unit.repository.javax.swing.event;

import javax.swing.event.MouseInputListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MouseInputListener} (by simply reusing
 * the J8Unit test interface {@link MouseInputListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class MouseInputListenerClassTest
implements MouseInputListenerClassTests<MouseInputListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.MouseInputListener]

    @Override
    public Class<MouseInputListener> createNewSUT() {
        return MouseInputListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.MouseInputListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.MouseInputListener]

}
