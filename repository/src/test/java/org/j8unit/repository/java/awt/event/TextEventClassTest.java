package org.j8unit.repository.java.awt.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TextEventClassTest
implements org.j8unit.repository.java.awt.event.TextEventClassTests<java.awt.event.TextEvent> {

    @Override
    public Class<java.awt.event.TextEvent> createNewSUT() {
        return java.awt.event.TextEvent.class;
    }

}
