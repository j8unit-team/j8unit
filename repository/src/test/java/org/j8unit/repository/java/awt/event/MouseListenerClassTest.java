package org.j8unit.repository.java.awt.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MouseListenerClassTest
implements org.j8unit.repository.java.awt.event.MouseListenerClassTests<java.awt.event.MouseListener> {

    @Override
    public Class<java.awt.event.MouseListener> createNewSUT() {
        return java.awt.event.MouseListener.class;
    }

}
