package org.j8unit.repository.javax.swing.event;

import javax.swing.event.PopupMenuListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PopupMenuListener} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.event.PopupMenuListenerClassTests}).
 */
@RunWith(J8Unit4.class)
public class PopupMenuListenerClassTest
implements PopupMenuListenerClassTests<PopupMenuListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.PopupMenuListener]

    @Override
    public Class<PopupMenuListener> createNewSUT() {
        return PopupMenuListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.PopupMenuListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.PopupMenuListener]

}
