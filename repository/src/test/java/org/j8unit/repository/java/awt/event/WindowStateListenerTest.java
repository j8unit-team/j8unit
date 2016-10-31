package org.j8unit.repository.java.awt.event;

import java.awt.event.WindowStateListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WindowStateListenerTest
implements org.j8unit.repository.java.awt.event.WindowStateListenerTests<WindowStateListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.event.WindowStateListener]

    @Override
    public WindowStateListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.event.WindowStateListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.event.WindowStateListener]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.event.WindowStateListener]

}
