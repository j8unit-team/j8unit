package org.j8unit.repository.java.awt.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FocusEventClassTest
implements org.j8unit.repository.java.awt.event.FocusEventClassTests<java.awt.event.FocusEvent> {

    @Override
    public Class<java.awt.event.FocusEvent> createNewSUT() {
        return java.awt.event.FocusEvent.class;
    }

}
