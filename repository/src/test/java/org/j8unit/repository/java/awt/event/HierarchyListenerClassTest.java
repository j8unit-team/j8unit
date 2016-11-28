package org.j8unit.repository.java.awt.event;

import java.awt.event.HierarchyListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HierarchyListener} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.event.HierarchyListenerClassTests}).
 */
@RunWith(J8Unit4.class)
public class HierarchyListenerClassTest
implements HierarchyListenerClassTests<HierarchyListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.event.HierarchyListener]

    @Override
    public Class<HierarchyListener> createNewSUT() {
        return HierarchyListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.event.HierarchyListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.event.HierarchyListener]

}
