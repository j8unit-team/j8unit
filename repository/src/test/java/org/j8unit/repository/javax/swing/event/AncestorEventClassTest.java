package org.j8unit.repository.javax.swing.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AncestorEventClassTest
implements org.j8unit.repository.javax.swing.event.AncestorEventClassTests<javax.swing.event.AncestorEvent> {

    @Override
    public Class<javax.swing.event.AncestorEvent> createNewSUT() {
        return javax.swing.event.AncestorEvent.class;
    }

}
