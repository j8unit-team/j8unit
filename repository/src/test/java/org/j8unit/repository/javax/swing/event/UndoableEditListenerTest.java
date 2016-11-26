package org.j8unit.repository.javax.swing.event;

import javax.swing.event.UndoableEditListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link UndoableEditListener} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.swing.event.UndoableEditListenerTests}).
 */
@RunWith(J8Unit4.class)
public class UndoableEditListenerTest
implements UndoableEditListenerTests<UndoableEditListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.event.UndoableEditListener]

    @Override
    public UndoableEditListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.event.UndoableEditListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.event.UndoableEditListener]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.event.UndoableEditListener]

}
