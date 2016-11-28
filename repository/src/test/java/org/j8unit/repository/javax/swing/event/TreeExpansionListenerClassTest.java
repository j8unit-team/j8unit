package org.j8unit.repository.javax.swing.event;

import javax.swing.event.TreeExpansionListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TreeExpansionListener} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.swing.event.TreeExpansionListenerClassTests}).
 */
@RunWith(J8Unit4.class)
public class TreeExpansionListenerClassTest
implements TreeExpansionListenerClassTests<TreeExpansionListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.TreeExpansionListener]

    @Override
    public Class<TreeExpansionListener> createNewSUT() {
        return TreeExpansionListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.TreeExpansionListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.TreeExpansionListener]

}
