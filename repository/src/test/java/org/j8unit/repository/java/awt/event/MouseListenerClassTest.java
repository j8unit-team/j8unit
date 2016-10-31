package org.j8unit.repository.java.awt.event;

import java.awt.event.MouseListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MouseListenerClassTest
implements org.j8unit.repository.java.awt.event.MouseListenerClassTests<MouseListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.event.MouseListener]

    @Override
    public Class<MouseListener> createNewSUT() {
        return MouseListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.event.MouseListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.event.MouseListener]

}
