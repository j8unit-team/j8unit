package org.j8unit.repository.javax.swing.event;

import javax.swing.event.ChangeListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ChangeListener} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.swing.event.ChangeListenerTests}).
 */

@RunWith(J8Unit4.class)
public class ChangeListenerTest
implements ChangeListenerTests<ChangeListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.ChangeListener]

    @Override
    public ChangeListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.event.ChangeListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.event.ChangeListener]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.event.ChangeListener]

}
