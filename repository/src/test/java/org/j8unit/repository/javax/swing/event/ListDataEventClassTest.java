package org.j8unit.repository.javax.swing.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ListDataEventClassTest
implements org.j8unit.repository.javax.swing.event.ListDataEventClassTests<javax.swing.event.ListDataEvent> {

    @Override
    public Class<javax.swing.event.ListDataEvent> createNewSUT() {
        return javax.swing.event.ListDataEvent.class;
    }

}
