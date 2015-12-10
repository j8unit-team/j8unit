package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EventClassTest
implements org.j8unit.repository.java.awt.EventClassTests<java.awt.Event> {

    @Override
    public Class<java.awt.Event> createNewSUT() {
        return java.awt.Event.class;
    }

}
