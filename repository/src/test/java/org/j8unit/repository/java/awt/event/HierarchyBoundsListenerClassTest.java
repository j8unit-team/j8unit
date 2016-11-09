package org.j8unit.repository.java.awt.event;

import java.awt.event.HierarchyBoundsListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HierarchyBoundsListener} (by simply
 * reusing the J8Unit test interface {@link HierarchyBoundsListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class HierarchyBoundsListenerClassTest
implements HierarchyBoundsListenerClassTests<HierarchyBoundsListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.event.HierarchyBoundsListener]

    @Override
    public Class<HierarchyBoundsListener> createNewSUT() {
        return HierarchyBoundsListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.event.HierarchyBoundsListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.event.HierarchyBoundsListener]

}
