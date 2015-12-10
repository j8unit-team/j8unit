package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EventQueueClassTest
implements org.j8unit.repository.java.awt.EventQueueClassTests<java.awt.EventQueue> {

    @Override
    public Class<java.awt.EventQueue> createNewSUT() {
        return java.awt.EventQueue.class;
    }

}
