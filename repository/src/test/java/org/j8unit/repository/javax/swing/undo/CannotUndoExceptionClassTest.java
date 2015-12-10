package org.j8unit.repository.javax.swing.undo;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CannotUndoExceptionClassTest
implements org.j8unit.repository.javax.swing.undo.CannotUndoExceptionClassTests<javax.swing.undo.CannotUndoException> {

    @Override
    public Class<javax.swing.undo.CannotUndoException> createNewSUT() {
        return javax.swing.undo.CannotUndoException.class;
    }

}
