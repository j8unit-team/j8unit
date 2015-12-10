package org.j8unit.repository.javax.swing.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UndoableEditEventClassTest
implements org.j8unit.repository.javax.swing.event.UndoableEditEventClassTests<javax.swing.event.UndoableEditEvent> {

    @Override
    public Class<javax.swing.event.UndoableEditEvent> createNewSUT() {
        return javax.swing.event.UndoableEditEvent.class;
    }

}
