package org.j8unit.repository.javax.swing.event;

import javax.swing.event.TreeWillExpandListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TreeWillExpandListener} (by simply
 * reusing the J8Unit test interface {@link TreeWillExpandListenerTests}).
 */

@RunWith(J8Unit4.class)
public class TreeWillExpandListenerTest
implements TreeWillExpandListenerTests<TreeWillExpandListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.TreeWillExpandListener]

    @Override
    public TreeWillExpandListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.event.TreeWillExpandListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.event.TreeWillExpandListener]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.event.TreeWillExpandListener]

}
