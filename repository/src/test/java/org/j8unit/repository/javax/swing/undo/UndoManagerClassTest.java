package org.j8unit.repository.javax.swing.undo;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UndoManagerClassTest
implements org.j8unit.repository.javax.swing.undo.UndoManagerClassTests<javax.swing.undo.UndoManager> {

    @Override
    public Class<javax.swing.undo.UndoManager> createNewSUT() {
        return javax.swing.undo.UndoManager.class;
    }

}
