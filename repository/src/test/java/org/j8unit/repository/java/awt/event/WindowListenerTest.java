package org.j8unit.repository.java.awt.event;

import java.awt.event.WindowListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WindowListenerTest
implements org.j8unit.repository.java.awt.event.WindowListenerTests<WindowListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.event.WindowListener]

    @Override
    public WindowListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.event.WindowListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.event.WindowListener]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.event.WindowListener]

}
