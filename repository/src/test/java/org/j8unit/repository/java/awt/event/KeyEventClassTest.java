package org.j8unit.repository.java.awt.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyEventClassTest
implements org.j8unit.repository.java.awt.event.KeyEventClassTests<java.awt.event.KeyEvent> {

    @Override
    public Class<java.awt.event.KeyEvent> createNewSUT() {
        return java.awt.event.KeyEvent.class;
    }

}
