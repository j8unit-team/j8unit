package org.j8unit.repository.javax.swing.undo;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UndoableEditClassTest
implements org.j8unit.repository.javax.swing.undo.UndoableEditClassTests<javax.swing.undo.UndoableEdit> {

    @Override
    public Class<javax.swing.undo.UndoableEdit> createNewSUT() {
        return javax.swing.undo.UndoableEdit.class;
    }

}
