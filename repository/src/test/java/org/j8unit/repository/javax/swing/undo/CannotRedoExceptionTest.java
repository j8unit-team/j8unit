package org.j8unit.repository.javax.swing.undo;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CannotRedoExceptionTest
implements org.j8unit.repository.javax.swing.undo.CannotRedoExceptionTests<javax.swing.undo.CannotRedoException> {

    @Override
    public javax.swing.undo.CannotRedoException createNewSUT() {
        return new javax.swing.undo.CannotRedoException();
    }

}
