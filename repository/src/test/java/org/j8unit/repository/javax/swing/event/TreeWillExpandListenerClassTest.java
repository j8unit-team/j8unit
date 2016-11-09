package org.j8unit.repository.javax.swing.event;

import javax.swing.event.TreeWillExpandListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TreeWillExpandListener} (by simply
 * reusing the J8Unit test interface {@link TreeWillExpandListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class TreeWillExpandListenerClassTest
implements TreeWillExpandListenerClassTests<TreeWillExpandListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.TreeWillExpandListener]

    @Override
    public Class<TreeWillExpandListener> createNewSUT() {
        return TreeWillExpandListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.TreeWillExpandListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.TreeWillExpandListener]

}
