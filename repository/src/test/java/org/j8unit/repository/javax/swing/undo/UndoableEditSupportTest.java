package org.j8unit.repository.javax.swing.undo;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UndoableEditSupportTest
implements org.j8unit.repository.javax.swing.undo.UndoableEditSupportTests<javax.swing.undo.UndoableEditSupport> {

    @Override
    public javax.swing.undo.UndoableEditSupport createNewSUT() {
        return new javax.swing.undo.UndoableEditSupport();
    }

}
