package org.j8unit.repository.java.awt;

import java.awt.KeyEventDispatcher;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link KeyEventDispatcher} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.KeyEventDispatcherClassTests}).
 */
@RunWith(J8Unit4.class)
public class KeyEventDispatcherClassTest
implements KeyEventDispatcherClassTests<KeyEventDispatcher> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.KeyEventDispatcher]

    @Override
    public Class<KeyEventDispatcher> createNewSUT() {
        return KeyEventDispatcher.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.KeyEventDispatcher]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.KeyEventDispatcher]

}
