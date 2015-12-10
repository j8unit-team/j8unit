package org.j8unit.repository.javax.swing.undo;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UndoManagerTest
implements org.j8unit.repository.javax.swing.undo.UndoManagerTests<javax.swing.undo.UndoManager> {

    @Override
    public javax.swing.undo.UndoManager createNewSUT() {
        return new javax.swing.undo.UndoManager();
    }

}
