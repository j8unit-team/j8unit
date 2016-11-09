package org.j8unit.repository.javax.swing.event;

import javax.swing.event.MouseInputListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MouseInputListener} (by simply
 * reusing the J8Unit test interface {@link MouseInputListenerTests}).
 */

@RunWith(J8Unit4.class)
public class MouseInputListenerTest
implements MouseInputListenerTests<MouseInputListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.MouseInputListener]

    @Override
    public MouseInputListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.event.MouseInputListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.event.MouseInputListener]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.event.MouseInputListener]

}
