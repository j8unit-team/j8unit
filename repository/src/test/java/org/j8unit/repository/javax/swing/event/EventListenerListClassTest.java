package org.j8unit.repository.javax.swing.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EventListenerListClassTest
implements org.j8unit.repository.javax.swing.event.EventListenerListClassTests<javax.swing.event.EventListenerList> {

    @Override
    public Class<javax.swing.event.EventListenerList> createNewSUT() {
        return javax.swing.event.EventListenerList.class;
    }

}
