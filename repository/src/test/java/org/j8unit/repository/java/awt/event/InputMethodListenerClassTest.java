package org.j8unit.repository.java.awt.event;

import java.awt.event.InputMethodListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link InputMethodListener} (by simply reusing
 * the J8Unit test interface {@link InputMethodListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class InputMethodListenerClassTest
implements InputMethodListenerClassTests<InputMethodListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.event.InputMethodListener]

    @Override
    public Class<InputMethodListener> createNewSUT() {
        return InputMethodListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.event.InputMethodListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.event.InputMethodListener]

}
