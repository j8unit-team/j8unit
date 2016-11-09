package org.j8unit.repository.javax.swing.event;

import javax.swing.event.ChangeListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ChangeListener} (by simply reusing the
 * J8Unit test interface {@link ChangeListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class ChangeListenerClassTest
implements ChangeListenerClassTests<ChangeListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.ChangeListener]

    @Override
    public Class<ChangeListener> createNewSUT() {
        return ChangeListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.ChangeListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.ChangeListener]

}
