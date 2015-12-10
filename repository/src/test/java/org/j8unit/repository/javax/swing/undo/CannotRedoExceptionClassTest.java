package org.j8unit.repository.javax.swing.undo;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CannotRedoExceptionClassTest
implements org.j8unit.repository.javax.swing.undo.CannotRedoExceptionClassTests<javax.swing.undo.CannotRedoException> {

    @Override
    public Class<javax.swing.undo.CannotRedoException> createNewSUT() {
        return javax.swing.undo.CannotRedoException.class;
    }

}
