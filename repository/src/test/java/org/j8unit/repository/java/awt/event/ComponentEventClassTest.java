package org.j8unit.repository.java.awt.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ComponentEventClassTest
implements org.j8unit.repository.java.awt.event.ComponentEventClassTests<java.awt.event.ComponentEvent> {

    @Override
    public Class<java.awt.event.ComponentEvent> createNewSUT() {
        return java.awt.event.ComponentEvent.class;
    }

}
