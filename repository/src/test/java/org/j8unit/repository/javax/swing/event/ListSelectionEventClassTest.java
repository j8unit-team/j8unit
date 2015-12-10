package org.j8unit.repository.javax.swing.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ListSelectionEventClassTest
implements org.j8unit.repository.javax.swing.event.ListSelectionEventClassTests<javax.swing.event.ListSelectionEvent> {

    @Override
    public Class<javax.swing.event.ListSelectionEvent> createNewSUT() {
        return javax.swing.event.ListSelectionEvent.class;
    }

}
