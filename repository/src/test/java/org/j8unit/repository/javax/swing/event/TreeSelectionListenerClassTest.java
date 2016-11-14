package org.j8unit.repository.javax.swing.event;

import javax.swing.event.TreeSelectionListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TreeSelectionListener} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.swing.event.TreeSelectionListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class TreeSelectionListenerClassTest
implements TreeSelectionListenerClassTests<TreeSelectionListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.TreeSelectionListener]

    @Override
    public Class<TreeSelectionListener> createNewSUT() {
        return TreeSelectionListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.TreeSelectionListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.TreeSelectionListener]

}
