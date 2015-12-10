package org.j8unit.repository.javax.swing.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TreeSelectionEventClassTest
implements org.j8unit.repository.javax.swing.event.TreeSelectionEventClassTests<javax.swing.event.TreeSelectionEvent> {

    @Override
    public Class<javax.swing.event.TreeSelectionEvent> createNewSUT() {
        return javax.swing.event.TreeSelectionEvent.class;
    }

}
