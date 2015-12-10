package org.j8unit.repository.javax.swing.undo;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UndoableEditSupportClassTest
implements org.j8unit.repository.javax.swing.undo.UndoableEditSupportClassTests<javax.swing.undo.UndoableEditSupport> {

    @Override
    public Class<javax.swing.undo.UndoableEditSupport> createNewSUT() {
        return javax.swing.undo.UndoableEditSupport.class;
    }

}
