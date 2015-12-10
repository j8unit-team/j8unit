package org.j8unit.repository.javax.swing.event;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UndoableEditEventTest
implements org.j8unit.repository.javax.swing.event.UndoableEditEventTests<javax.swing.event.UndoableEditEvent> {

    @Override
    public javax.swing.event.UndoableEditEvent createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.swing.event.UndoableEditEvent] available.");
    }

}
