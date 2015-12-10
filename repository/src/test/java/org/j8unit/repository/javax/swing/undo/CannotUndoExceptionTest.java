package org.j8unit.repository.javax.swing.undo;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CannotUndoExceptionTest
implements org.j8unit.repository.javax.swing.undo.CannotUndoExceptionTests<javax.swing.undo.CannotUndoException> {

    @Override
    public javax.swing.undo.CannotUndoException createNewSUT() {
        return new javax.swing.undo.CannotUndoException();
    }

}
