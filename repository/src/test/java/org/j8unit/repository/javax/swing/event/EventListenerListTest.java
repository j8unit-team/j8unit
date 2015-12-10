package org.j8unit.repository.javax.swing.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EventListenerListTest
implements org.j8unit.repository.javax.swing.event.EventListenerListTests<javax.swing.event.EventListenerList> {

    @Override
    public javax.swing.event.EventListenerList createNewSUT() {
        return new javax.swing.event.EventListenerList();
    }

}
