package org.j8unit.repository.javax.swing.event;

import javax.swing.event.ListDataListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ListDataListener} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.event.ListDataListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class ListDataListenerClassTest
implements ListDataListenerClassTests<ListDataListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.ListDataListener]

    @Override
    public Class<ListDataListener> createNewSUT() {
        return ListDataListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.ListDataListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.ListDataListener]

}
