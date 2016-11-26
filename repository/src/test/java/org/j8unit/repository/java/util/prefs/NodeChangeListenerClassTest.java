package org.j8unit.repository.java.util.prefs;

import java.util.prefs.NodeChangeListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NodeChangeListener} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.util.prefs.NodeChangeListenerClassTests}).
 */
@RunWith(J8Unit4.class)
public class NodeChangeListenerClassTest
implements NodeChangeListenerClassTests<NodeChangeListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.prefs.NodeChangeListener]

    @Override
    public Class<NodeChangeListener> createNewSUT() {
        return NodeChangeListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.prefs.NodeChangeListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.prefs.NodeChangeListener]

}
