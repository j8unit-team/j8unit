package org.j8unit.repository.java.awt.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MouseEventClassTest
implements org.j8unit.repository.java.awt.event.MouseEventClassTests<java.awt.event.MouseEvent> {

    @Override
    public Class<java.awt.event.MouseEvent> createNewSUT() {
        return java.awt.event.MouseEvent.class;
    }

}
