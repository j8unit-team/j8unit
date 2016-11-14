package org.j8unit.repository.java.awt.event;

import java.awt.event.KeyListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link KeyListener} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.event.KeyListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class KeyListenerClassTest
implements KeyListenerClassTests<KeyListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.event.KeyListener]

    @Override
    public Class<KeyListener> createNewSUT() {
        return KeyListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.event.KeyListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.event.KeyListener]

}
