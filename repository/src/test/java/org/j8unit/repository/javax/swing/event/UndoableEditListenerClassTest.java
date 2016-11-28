package org.j8unit.repository.javax.swing.event;

import javax.swing.event.UndoableEditListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link UndoableEditListener} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.swing.event.UndoableEditListenerClassTests}).
 */
@RunWith(J8Unit4.class)
public class UndoableEditListenerClassTest
implements UndoableEditListenerClassTests<UndoableEditListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.event.UndoableEditListener]

    @Override
    public Class<UndoableEditListener> createNewSUT() {
        return UndoableEditListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.event.UndoableEditListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.event.UndoableEditListener]

}
