package org.j8unit.repository.javax.swing.event;

import javax.swing.event.ListSelectionListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ListSelectionListener} (by simply reusing
 * the J8Unit test interface {@link ListSelectionListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class ListSelectionListenerClassTest
implements ListSelectionListenerClassTests<ListSelectionListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.ListSelectionListener]

    @Override
    public Class<ListSelectionListener> createNewSUT() {
        return ListSelectionListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.ListSelectionListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.ListSelectionListener]

}
