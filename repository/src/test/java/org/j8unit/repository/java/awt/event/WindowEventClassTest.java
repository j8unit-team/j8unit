package org.j8unit.repository.java.awt.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WindowEventClassTest
implements org.j8unit.repository.java.awt.event.WindowEventClassTests<java.awt.event.WindowEvent> {

    @Override
    public Class<java.awt.event.WindowEvent> createNewSUT() {
        return java.awt.event.WindowEvent.class;
    }

}
