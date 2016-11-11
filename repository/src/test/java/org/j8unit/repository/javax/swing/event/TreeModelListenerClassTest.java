package org.j8unit.repository.javax.swing.event;

import javax.swing.event.TreeModelListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TreeModelListener} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.event.TreeModelListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class TreeModelListenerClassTest
implements TreeModelListenerClassTests<TreeModelListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.TreeModelListener]

    @Override
    public Class<TreeModelListener> createNewSUT() {
        return TreeModelListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.TreeModelListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.TreeModelListener]

}
