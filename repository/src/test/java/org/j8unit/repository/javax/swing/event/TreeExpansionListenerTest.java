package org.j8unit.repository.javax.swing.event;

import javax.swing.event.TreeExpansionListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TreeExpansionListener} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.swing.event.TreeExpansionListenerTests}).
 */
@RunWith(J8Unit4.class)
public class TreeExpansionListenerTest
implements TreeExpansionListenerTests<TreeExpansionListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.TreeExpansionListener]

    @Override
    public TreeExpansionListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.event.TreeExpansionListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.event.TreeExpansionListener]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.event.TreeExpansionListener]

}
