package org.j8unit.repository.java.awt.event;

import java.awt.event.WindowListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WindowListenerClassTest
implements org.j8unit.repository.java.awt.event.WindowListenerClassTests<WindowListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.event.WindowListener]

    @Override
    public Class<WindowListener> createNewSUT() {
        return WindowListener.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.event.WindowListener]

}
