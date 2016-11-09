package org.j8unit.repository.java.awt.event;

import java.awt.event.FocusListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FocusListener} (by simply reusing the
 * J8Unit test interface {@link FocusListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class FocusListenerClassTest
implements FocusListenerClassTests<FocusListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.event.FocusListener]

    @Override
    public Class<FocusListener> createNewSUT() {
        return FocusListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.event.FocusListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.event.FocusListener]

}
