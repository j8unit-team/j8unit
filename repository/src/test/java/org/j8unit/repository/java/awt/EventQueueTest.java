package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EventQueueTest
implements org.j8unit.repository.java.awt.EventQueueTests<java.awt.EventQueue> {

    @Override
    public java.awt.EventQueue createNewSUT() {
        return new java.awt.EventQueue();
    }

}
